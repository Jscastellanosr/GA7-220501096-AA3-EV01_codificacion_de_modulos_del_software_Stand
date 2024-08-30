
package com.proyecto1.ejemploHibertnate.controller;

import com.proyecto1.ejemploHibertnate.model.Usuario;
import com.proyecto1.ejemploHibertnate.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//llamar los metodos de la comunicacion del lado de la web

@RestController
@RequestMapping("/usuario")

public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    
    //create
    
    @PostMapping("/nuevo")
    public Usuario newUsuario(@RequestBody Usuario newUsuario){
    
        return this.usuarioService.newUsuario(newUsuario);
    }
    
    //read
    @GetMapping("/mostrar")
    public Iterable<Usuario> getAll(){
        return usuarioService.getAll();
    }
    
    //update
    
    
    @PostMapping("/modificar")
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        return this.usuarioService.modifyUsuario(usuario);
    }
    
    
    //delete
    @PostMapping(value="/{id}")
    public Boolean deleteUsuario(@PathVariable(value="id") Long id){
    
        return this.usuarioService.deleteUsuario(id);
    }
    
    
    
}
