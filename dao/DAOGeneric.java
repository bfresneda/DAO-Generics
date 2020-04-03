package com.qintess.estudo.hibernate.dao;

import java.util.List;

public interface DAOGeneric<T> {

	public T buscarPorId(int id);
	public List<T> buscarTodos();
	public void atualizar(T item);
	public void inserir(T item);
	public void remover(int id);
	
	
	
}
	
