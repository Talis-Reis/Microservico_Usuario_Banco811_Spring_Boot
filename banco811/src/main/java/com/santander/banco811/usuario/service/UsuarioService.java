package com.santander.banco811.usuario.service;

import com.santander.banco811.usuario.model.Usuario;

public interface UsuarioService {
    Usuario getByCPF(String cpf);
}
