package com.qintess.estudo.hibernate.dao;

import java.sql.PreparedStatement;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qintess.estudo.hibernate.config.HibernateConfig;

public class DAO<T> {
	

	public void inserir(T objeto) {
		Transaction transacao = null;
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			transacao = session.beginTransaction();
			session.save(objeto);
			transacao.commit();
		} catch (Exception e) {
			if (transacao != null) {
				transacao.rollback();
			}
			e.printStackTrace();
		}
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<T> buscarTodos(Class<T> obj){
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			return session.createCriteria(obj).list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public T buscarPorId(Class<T> obj, Integer id) {
		Transaction transacao = null;
		T object = null;
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			transacao = session.beginTransaction();
			
			object = session.find(obj, id);
			
			//object = (T) session.find(obj, id);			
			transacao.commit();
		} catch (Exception e) {
			if (transacao != null) {
				transacao.rollback();
			}
			e.printStackTrace();
		}
		return object;

	}
	
	public void atualizar(Class<T> obj, Integer id) {
		Transaction transacao = null;
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			transacao = session.beginTransaction();
			session.update(session.find(obj, id));
			transacao.commit();
		} catch (Exception e) {
			if (transacao != null) {
				transacao.rollback();
			}
			e.printStackTrace();
		}
	}
	
	
	public void remover(Class<T> obj, Integer id) {
		
		Transaction transacao = null;
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {			
			transacao = session.beginTransaction();	
			session.remove(session.find(obj, id));
			transacao.commit();
		} catch (Exception e) {
			if (transacao != null) {
				transacao.rollback();
			}
			e.printStackTrace();
		}
	}


}
