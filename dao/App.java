package com.qintess.estudo.hibernate.dao;

import java.util.List;

import com.qintess.estudo.hibernate.model.ItemVenda;
import com.qintess.estudo.hibernate.model.Produto;
import com.qintess.estudo.hibernate.model.Venda;

public class App {

	public static void main(String[] args) {
		

		DAO<Produto> dao = new DAO<>();
		dao.buscarTodos(Produto.class);
				
//		Produto prod = new Produto("Bala 7Belo", 0.25);
//		Produto prod2 = new Produto("Lapiseira 0.7", 7.0);

		
		
		Venda venda = new Venda();
		
		ItemVenda iv1 = new ItemVenda();
		
		//salvar a venda		
//		iv1.setProduto(prod2);
//		iv1.setQtd(1);
//		iv1.setVenda(venda);
//		
		//salvar o item da venda
		
		
		//deletar
		//dao.remover(Produto.class, 4);
		
		//atualizar
		
		Produto prod = new Produto();
		
		prod.setId(3);
		prod.setPreco(8000.0);
		dao.atualizar(Produto.class, 3);
		
		
		
		List<Produto> produtosRetornados2 = dao.buscarTodos(Produto.class);
		
		for(Produto item : produtosRetornados2) {
			System.out.println(item);
		}
		
}
}
