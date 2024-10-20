//Se crea la interface para poder heredar desde la clase servicios con la extension extends. Almacena datos que ingresa el usuagio
package com.proyecto.Proyecto1.Repository;
import com.proyecto.Proyecto1.Model.servicios;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author USUARIO
 */
public interface ServiciosRepository extends JpaRepository<servicios, Long> {

   
}
