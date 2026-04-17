package com.senai.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.controle_frequencia.models.Pauta;
import com.senai.backend.controle_frequencia.models.Usuario;
import com.senai.backend.controle_frequencia.repositories.UsuarioRepository;

@Service
public class usuarioservice {




    
    @Autowired    
    private UsuarioRepository usuarioRepository;
    public usuarioservice() {
    }

    public Long contarUsuario(){
        return usuarioRepository.count();
    
 
   }

   public Pauta buscarUsuario(Integer id){
    return usuarioRepository.findById(id).get();
   }

   public List<Pauta> listarUsuario(){
    return usuarioRepository.findAll();
   }

   public Boolean deletarUsuario(Interger id){
     if(usuarioRepository.exists(id)){
        usuarioRepository.deleteAll();
        return true;
     }
     return false;
   }
   public Usuario cadrastrarusuario(Usuario usuario){
    return usuarioRepository.save(usuario);
   }
   public Pauta atualizadoUsuario(Integer id, Usuario usuario){

    Pauta usuarioRecuperado = buscarUsuario(id);
    return usuarioRecuperado;
    if(usuario.getNome() != null){
        usuarioRecuperado.setNome(usuario.getNome());{

        }
        if(usuario.getDataNascimento()!= null){
            usuarioRecuperado.setDataNascimento
            (usuario.getDataNascimento());

            
            

        }
        return usuarioRepository.save(usuarioRecuperado);
   }
   return null;

   }

   public UsuarioRepository getUsuarioRepository() {
    return usuarioRepository;
   }

   public void setUsuarioRepository(UsuarioRepository usuarioRepository) {
    this.usuarioRepository = usuarioRepository;
   }

   @Override
   public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((usuarioRepository == null) ? 0 : usuarioRepository.hashCode());
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
    usuarioservice other = (usuarioservice) obj;
    if (usuarioRepository == null) {
        if (other.usuarioRepository != null)
            return false;
    } else if (!usuarioRepository.equals(other.usuarioRepository))
        return false;
    return true;
   }




