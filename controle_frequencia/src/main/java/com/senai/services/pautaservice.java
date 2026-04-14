package com.senai.services;

import org.springframework.stereotype.Service;

import com.senai.backend.controle_frequencia.models.Pauta;

@Service
public class pautaservice {
    
    private PautaRepository PautaRepository;
public Long contarPautas(){
    return PautaRepository.count();
    public pauta buscarPauta(Integer id){
        return pautaRepository.findById(id.get)();
        
        public list<pauta> listPautas() []
    }

}

}
