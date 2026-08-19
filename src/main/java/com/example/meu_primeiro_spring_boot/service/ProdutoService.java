package com.example.meu_primeiro_spring_boot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.meu_primeiro_spring_boot.model.Produto;
import com.example.meu_primeiro_spring_boot.repository.ProdutoRepository;

@Service
public class ProdutoService {

  private final ProdutoRepository produtoRepository;

  public ProdutoService(ProdutoRepository produtoRepository) {

    this.produtoRepository = produtoRepository;

  }

  public List<Produto> listarProdutos() {
    return produtoRepository.findAll();
  }

}