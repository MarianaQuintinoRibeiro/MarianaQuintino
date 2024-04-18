package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Fornecedor;
import com.example.repository.FornecedorRepository;

@Service
public class FornecedorService {
	
	@Autowired
	private FornecedorRepository fornecedorRepository;

	public List<Fornecedor> getAllFornecedors() {
		return fornecedorRepository.findAll();
	}

	public Fornecedor getFornecedorById(long id) {
		return fornecedorRepository.findById(id).orElse(null);
	}

	public Fornecedor saveFornecedor(Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);
	}

}
