package com.senai.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senai.backend.controle_frequencia.models.Pauta;

@Service
public class pautaservice {
    
    private PautaRepository PautaRepository;
public Long contarPautas(){
    return PautaRepository.count();
}

public Pauta buscarPauta(Integer id){
    return (Pauta) PautaRepository.findById(id);
}

    public List<Pauta> listPautas(){
        return PautaRepository.findAll();// Lista todas as pautas
    }

    public boolean deletarPauta(Integer id){// Recupera a pauta pelo ID
        Pauta pauta = (Pauta) PautaRepository.findById(id);// Recupera a pauta pelo ID
        if (pauta != null) {
            PautaRepository.delete(pauta);// Deleta a pauta
            return true;
        }
        return false;// Pauta não encontrada
    }
    public Pauta cadastrarPauta(Pauta pauta){
        return PautaRepository.save(pauta); // Cadastro de nova pauta
    }

    public Pauta atualizarPauta(Integer id, Pauta pauta){// Atualiza uma pauta existente
        Pauta pautaRecuperada = (Pauta) PautaRepository.findById(id);// Recupera a pauta pelo ID
        if(pauta.getNome() != null){// Verifica se o nome da pauta foi informado
            pautaRecuperada.setNome(pauta.getNome());// Atualiza o nome da pauta
        }
        if(pauta.getTurma() != null){// Verifica se a turma da pauta foi informada
            pautaRecuperada.setTurma(pauta.getTurma());// Atualiza a turma da pauta
        }
        return PautaRepository.save(pautaRecuperada);// Salva as alterações da pauta
    }

    public PautaRepository getPautaRepository() {
        return PautaRepository;
    }

    public void setPautaRepository(PautaRepository pautaRepository) {
        PautaRepository = pautaRepository;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((PautaRepository == null) ? 0 : PautaRepository.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        pautaservice other = (pautaservice) obj;
        if (PautaRepository == null) {
            if (other.PautaRepository != null)
                return false;
        } else if (!PautaRepository.equals(other.PautaRepository))
            return false;
        return true;
    }
    return null;


}


