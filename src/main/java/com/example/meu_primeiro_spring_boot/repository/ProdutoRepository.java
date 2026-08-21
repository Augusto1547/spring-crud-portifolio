package com.example.meu_primeiro_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.meu_primeiro_spring_boot.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}