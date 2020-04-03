package com.qintess.estudo.hibernate.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.qintess.estudo.hibernate.model.ItemVenda;
import com.qintess.estudo.hibernate.model.Produto;
import com.qintess.estudo.hibernate.model.Venda;

public class HibernateConfig {

	private static SessionFactory  sessionFactory;  // responsavel por fazer a sessão com o banco de dados, e realizar as configurações
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			try {
				
				Configuration configuration = new Configuration();
				Properties prop = new Properties();
				
				
				//CONFIGURAÇOES DO BANCO DE DADOS
				prop.put(Environment.DRIVER, "org.h2.Driver");
				prop.put(Environment.URL, "jdbc:h2:~/db_estudo_hibernate");
				prop.put(Environment.USER, "sa");
				prop.put(Environment.PASS, "");
				prop.put(Environment.DIALECT, "org.hibernate.dialect.H2Dialect");
				
				//CONFIGURAÇÕES DO HIBERNATE
				prop.put(Environment.SHOW_SQL,"true"); ///vai exibir no console apos toda execução, porem em ambiente de producao manter false;
				prop.put(Environment.HBM2DDL_AUTO, "update"); // vai dropar e criar o banco de dados do zero, ambiente de producao manter false;
				
				//COLOCANDO AS INFORMACOES DO OBJETO DENTRO DA CONFIGURAÇÃO
				configuration.setProperties(prop);
				
				configuration.addAnnotatedClass(Produto.class);// adiciona as entidades existentes no banco de dados
				configuration.addAnnotatedClass(ItemVenda.class);
				configuration.addAnnotatedClass(Venda.class);
				
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
													.applySettings(configuration.getProperties())
													.build();
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
				
				
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
		
		return sessionFactory;
	}
}
