// Se crea la clase servicios donde se genera la entidad con sus categorias que seran reflejadas en la tabla de la base de datos, validacion UNIQUE, LENGTH NULLABLE
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
   @Column (name = "Id Servicio")
   private Long idservicio;
   
   @Column (name = "Nombre Servicio", unique =true, nullable =false, length =50)
   private String nombreServicio;
   
   @Column (nullable= false, length =10)
   private long Costo;
   
   @Column (name = "Descripcion", nullable =false, length =50)
   private String descripcion; 
   
    @Column (name = "Estado", nullable =false, length =20)
   private String estado;
}
