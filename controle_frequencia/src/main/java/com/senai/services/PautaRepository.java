package com.senai.services;

import com.senai.backend.controle_frequencia.models.Pauta;

public interface PautaRepository {

    Long count();

    Object findById(Integer id);

    List<Pauta> findAll();

    void delete(Pauta pauta);

    Pauta save(Pauta pauta);

}
