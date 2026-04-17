package controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.controle_frequencia.models.Pauta;
import com.senai.services.Interger;

@RestController
@RequestMapping("pauta")
public class PautaController {

    private PautaService pautaService;

    public Long contarPautas(){
        return pautaService.contarPautas();
    }

    public Pauta criarPauta(Pauta pauta) {
        return pautaService.buscarPauta(id);
    }

    @GetMapping("/{id}")
    public Pauta buscarPauta(@PathVariable Interger id) {
        return pautaService.buscarPauta(id);
    }

    public List<Pauta> listarPautas(){
        return PautaService.listarPautas();
    }

    public String deletarPauta(@PathVariable Integer id) {
        pautaService.deletarPauta(id);
        return "Pauta excluída com sucesso";
    }

    @PostMapping("/salvar-pauta")
    public Pauta cadastrarPauta(){
        return pautaService.cadastrarPauta();
    }

    @PutMapping("/atualizar-pauta/{id}")
    public String atualizarPauta(){
        Object id = null;
        Object pauta = null;
        if (pautaService.atualizarPauta(id, pauta)!=null){
            return "Pauta atualizada com sucesso";
        }

        return "Falha na atualização da pauta";
    }

}