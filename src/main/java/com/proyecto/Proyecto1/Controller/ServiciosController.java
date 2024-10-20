// Clase ServiciosController para poder llamar los metodos de la entidad a traves del lado web para que se lleve a cabo la comunicacion
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.Proyecto1.Controller;

import com.proyecto.Proyecto1.Model.servicios;
import com.proyecto.Proyecto1.Service.ServiciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author USUARIO
 */
@RestController
@RequestMapping("/servicios")
@CrossOrigin("*")
public class ServiciosController {
 
  @Autowired
    private ServiciosService serviciosService;
    
    @PostMapping("/nuevo")
    public servicios newServicios(@RequestBody servicios newServicios){
        return this.serviciosService.newServicios(newServicios);
    }
    
    @GetMapping("/mostrar")
    public Iterable<servicios> getAll(){
        return serviciosService.getAll();
        
    }
    @PostMapping("/modificar")
    public servicios updateServicios(@RequestBody servicios Servicios){
        return this.serviciosService.modiServicios(Servicios);
    }
    @PostMapping(value="/(id)")
    public Boolean deleteservicios (@PathVariable(value="id")Long id){
        return this.serviciosService.deleteservicios(id);
    }
    
    
}
