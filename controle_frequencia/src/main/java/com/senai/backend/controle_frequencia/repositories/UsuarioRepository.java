package com.senai.backend.controle_frequencia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.backend.controle_frequencia.models.Pauta;
import com.senai.backend.controle_frequencia.models.Usuario;
import com.senai.services.Interger;

public interface UsuarioRepository extends JpaRepository<Pauta, Integer> {

    Usuario save(Usuario usuario);

    boolean exists(Interger id);
    
}
