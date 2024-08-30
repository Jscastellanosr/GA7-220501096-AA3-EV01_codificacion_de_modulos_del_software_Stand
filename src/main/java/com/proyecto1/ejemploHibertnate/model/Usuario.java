
package com.proyecto1.ejemploHibertnate.model;

//clase para genera la entidad de la app

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;



@Entity
@Data

public class Usuario {
    
    @Id
    @Column
    private Long idUsuario;
    
    @Column
    private String nombre;
    
    @Column
    private String apellido;
    
    @Column
    private String email;
    
    
}
