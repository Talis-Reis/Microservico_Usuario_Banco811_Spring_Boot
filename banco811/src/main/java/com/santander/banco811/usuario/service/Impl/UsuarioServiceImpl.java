package com.santander.banco811.usuario.service.Impl;

import com.santander.banco811.usuario.model.Usuario;
import com.santander.banco811.usuario.repository.UsuarioRepository;
import com.santander.banco811.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Usuario getByCPF(String cpf) {
       return usuarioRepository.findByCpf(cpf);
    }
}
