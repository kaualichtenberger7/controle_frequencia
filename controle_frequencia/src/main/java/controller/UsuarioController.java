package controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.senai.backend.controle_frequencia.models.Usuario;

public class UsuarioController {
    private UsuarioService usuarioService;
    private Long id;

    @GetMapping("/usuarios")
    public long contarUsuarios() {
        return usuarioService.contarUsuarios();
    }

    @GetMapping("/buscar-usuario/{id}")
    public boolean buscarUsuario(@PathVariable Long id) {
        return usuarioService.buscarUsuario(id);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    public String deletarUsuario(){
        if (usuarioService.deletarUsuario(id)){
            return "Usuario deletado com sucesso";
        }
        return "falha ao deletar usuario";
    }

    @DeleteMapping("/deletar-usuario/{id}")
    public String deletarUsuario(@PathVariable Long id){
        if (usuarioService.buscarUsuario(id)){
            return "Usuario deletado com sucesso";
        }
        return "Usuario não encontrado";
    }     

    public Usuario cadastrarUsuario(Usuario usuario) {
        return usuarioService.cadastrarUsuario(usuario);
    }

    @PostMapping("/salvar-usuario")
    public Usuario cadastrarUsuario1(@RequestBody Usuario usuario) {
        return usuarioService.cadastrarUsuario(usuario);
    }

    public String atualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
        if (usuarioService.atualizarUsuario(id, usuario)){
            return "Usuario atualizado com sucesso";
        }
        return "falha ao atualizar usuario";
    }

    



}

