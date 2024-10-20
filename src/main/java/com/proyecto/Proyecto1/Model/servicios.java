// Se crea la clase servicios donde se genera la entidad con sus categorias que seran reflejadas en la tabla de la base de datos
package com.proyecto.Proyecto1.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *
 * @author USUARIO
 */
@Entity
@Data
public class servicios {
    @Id
   @Column
   private Long idservicio;
   
   @Column
   private String nombreServicio;
   
   @Column 
   private long Costo;
   
   @Column 
   private String descripcion; 
   
    @Column 
   private String estado;
}
