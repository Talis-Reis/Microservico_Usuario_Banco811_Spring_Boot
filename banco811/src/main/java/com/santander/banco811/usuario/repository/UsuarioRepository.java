package com.santander.banco811.usuario.repository;


import com.santander.banco811.usuario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Query("select u from Usuario u " +
            "where u.cpf = :cpf")
    Usuario findByCpf(@Param("cpf") String cpf);

}
