package com.qintess.estudo.hibernate.dao;

import java.util.List;

import com.qintess.estudo.hibernate.model.Produto;

public class ProdutoDao implements DAOGeneric<Produto> {
	
	public void buscarId() {
	}

	@Override
	public Produto buscaPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> buscaTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualiza(Produto item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insere(Produto item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remote(int id) {
		// TODO Auto-generated method stub
		
	}

//	public void salva(Produto produto) {
//		Transaction transacao = null;
//		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
//			transacao = session.beginTransaction(); // transacao iniciada nesse na sessao que esta aberta.
//			session.save(produto); /// vai fazer o update na tabela conforme as especificacoes da classe nesse caso a produto
//			transacao.commit(); // realiza o commit das modificacoes do banco de dados.
//
//		} catch (Exception e) {
//			if (transacao != null) {
//				transacao.rollback();
//			}
//			e.printStackTrace();
//		}
//	}
//
//	public void atualiza(Produto produto) {
//		Transaction transacao = null;
//		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
//			transacao = session.beginTransaction(); // transacao iniciada nesse na sessao que esta aberta.
//			session.merge(produto); /// vai fazer o merge na tabela conforme as especificacoes da classe nesse caso a produto
//			transacao.commit(); // realiza o commit das modificacoes do banco de dados.
//
//		} catch (Exception e) {
//			if (transacao != null) {
//				transacao.rollback();
//			}
//			e.printStackTrace();
//		}
//	}
//	
//	public void remove(Produto produto) {
//		Transaction transacao = null;
//		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
//			transacao = session.beginTransaction(); // transacao iniciada nesse na sessao que esta aberta.
//			session.remove(produto); /// vai fazer o merge na tabela conforme as especificacoes da classe nesse caso a produto
//			transacao.commit(); // realiza o commit das modificacoes do banco de dados.
//
//		} catch (Exception e) {
//			if (transacao != null) {
//				transacao.rollback();
//			}
//			e.printStackTrace();
//		}
//	}
//
//
//	public Produto buscaPorId(int id) {
//		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
//			return session.find(Produto.class, id);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//
//		}
//	}
//
//	public List<Produto> buscaTodos() {
//		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
//			return session.createQuery("from Produto", Produto.class).list();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//
//		}
//	}
}
