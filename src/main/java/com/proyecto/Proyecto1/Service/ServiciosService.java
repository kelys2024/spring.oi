// Se crea la clase ServiciosService para poder definir los componiente que va a crean para poder llamarlas desde el controlador, usar servicios de crud, update, eliminar, crear nuevo elemento que se pueda modificar,  
package com.proyecto.Proyecto1.Service;

import com.proyecto.Proyecto1.Model.servicios;

/**
 *
 * @author USUARIO
 */
public interface ServiciosService {
   servicios newServicios (servicios newServicios);
   Iterable<servicios> getAll();
   servicios modiServicios (servicios Servicios);
   Boolean deleteservicios (Long idservicio);    
}
