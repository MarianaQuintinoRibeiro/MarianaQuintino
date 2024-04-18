package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

}
