
package com.proyecto1.ejemploHibertnate.services;

import com.proyecto1.ejemploHibertnate.model.Usuario;


public interface UsuarioService {
    
    Usuario newUsuario (Usuario newUsuario);
    Iterable<Usuario> getAll();
    Usuario modifyUsuario (Usuario usuario);
    Boolean deleteUsuario (Long idUsuario);
}
