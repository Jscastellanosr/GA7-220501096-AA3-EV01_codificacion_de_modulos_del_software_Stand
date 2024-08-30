
package com.proyecto1.ejemploHibertnate.repository;

import com.proyecto1.ejemploHibertnate.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
     
}
