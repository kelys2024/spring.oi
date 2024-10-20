// Clase ServiciosServiceImple para crear un nuevo componente de la entidad,mostrarlo,actualizarlo y no retroanar nada si no encuentra, modificar, eliminar y guardar
package com.proyecto.Proyecto1.Service;

import com.proyecto.Proyecto1.Model.servicios;
import com.proyecto.Proyecto1.Repository.ServiciosRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosServiceImple implements ServiciosService{
    
    @Autowired
    private ServiciosRepository ServiciosRepository;
    
    @Override
    public servicios newServicios(servicios newServicios) {
        return ServiciosRepository.save(newServicios);
    }

    @Override
    public Iterable<servicios> getAll() {
         return this.ServiciosRepository.findAll();

    }

    @Override
    public servicios modiServicios(servicios Servicios) {
        Optional<servicios> ServiciosEncontrado= this.ServiciosRepository.findById(Servicios.getIdservicio());
        if(ServiciosEncontrado.get()!=null){
            ServiciosEncontrado.get().setNombreServicio(Servicios.getNombreServicio());
            ServiciosEncontrado.get().setCosto(Servicios.getCosto());
            ServiciosEncontrado.get().setDescripcion(Servicios.getDescripcion());
            ServiciosEncontrado.get().setEstado(Servicios.getEstado());
            return this.newServicios(ServiciosEncontrado.get());
        
            

    }
        return null;
    }
    @Override
    public Boolean deleteservicios(Long idservicio) {
        this.ServiciosRepository.deleteById(idservicio);
        return true;
    }

}