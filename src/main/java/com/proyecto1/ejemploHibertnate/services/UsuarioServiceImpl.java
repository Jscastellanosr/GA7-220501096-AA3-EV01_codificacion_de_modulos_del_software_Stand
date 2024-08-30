
package com.proyecto1.ejemploHibertnate.services;

import com.proyecto1.ejemploHibertnate.model.Usuario;
import com.proyecto1.ejemploHibertnate.repository.UsuarioRepositorio;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Override
    public Usuario newUsuario(Usuario newUsuario) {
        return usuarioRepositorio.save(newUsuario);
    }

    @Override
    public Iterable<Usuario> getAll() {
        return this.usuarioRepositorio.findAll();
    }

    @Override
    public Usuario modifyUsuario(Usuario usuario) {
        
        Optional<Usuario> usuarioEncontrado= this.usuarioRepositorio.findById(usuario.getIdUsuario());
        if(usuarioEncontrado.get()!=null){
            usuarioEncontrado.get().setNombre(usuario.getNombre());
            usuarioEncontrado.get().setApellido(usuario.getApellido());
            usuarioEncontrado.get().setEmail(usuario.getEmail());
            return this.newUsuario(usuarioEncontrado.get());
        }
        
        return null;
    }

    @Override
    public Boolean deleteUsuario(Long idUsuario) {
        
        this.usuarioRepositorio.deleteById(idUsuario);
        return true;
    }
    
}
