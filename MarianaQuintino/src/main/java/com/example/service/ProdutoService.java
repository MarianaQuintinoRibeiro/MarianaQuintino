package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Produto;
import com.example.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;

	public List<Produto> getAllProdutos() {
		return produtoRepository.findAll();
	}

	public Produto getProdutoById(long id) {
		return produtoRepository.findById(id).orElse(null);
	}

	public Produto saveProduto(Produto produto) {
		return produtoRepository.save(produto);
	}

}
