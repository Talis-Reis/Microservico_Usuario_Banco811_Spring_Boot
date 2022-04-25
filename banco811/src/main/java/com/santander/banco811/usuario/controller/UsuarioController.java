package com.santander.banco811.usuario.controller;

import com.santander.banco811.usuario.model.Usuario;
import com.santander.banco811.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/{cpf}")
    public Usuario getById(@PathVariable String cpf) {
        return usuarioService.getByCPF(cpf);
    }

}
