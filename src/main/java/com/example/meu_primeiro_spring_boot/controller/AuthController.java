package com.example.meu_primeiro_spring_boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    
  private final UsuarioService usuarioService;

  public AuthController(UsuarioService usuarioService){

    this.usuarioService = usuarioService;
  }

}