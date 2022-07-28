/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smartsoft.invoicemanager.Controller;

import com.smartsoft.invoicemanager.Model.Detalle;
import com.smartsoft.invoicemanager.Service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author MSANCHEZ
 */
@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
public class DetailController {
    @Autowired
    private DetailService detailService;
    
    //listar
    @GetMapping("/detalles")
    public List<Detalle> listar(){
        return detailService.findAll();
    }
    
    //guardar
    @PostMapping("/detalles")
    public Detalle guardar(@RequestBody Detalle detalle){
        return detailService.save(detalle);
    }
    
    @GetMapping("/detalles/{id}")
    public Detalle getUnaDetalle(@PathVariable Integer id){
        return detailService.findById(id);
    }
    
    //Editar
    @PutMapping("/detalles/{id}")
    public Detalle modificar (@RequestBody Detalle detalle,@PathVariable Integer id){
        Detalle detalleActual=detailService.findById(id);
        detalleActual.setNum_detalle(detalle.getNum_detalle());
        detalleActual.setId_producto(detalle.getId_producto());
        detalleActual.setId_factura(detalle.getId_factura());
        detalleActual.setPrecio(detalle.getPrecio());
        detalleActual.setCantidad(detalle.getCantidad());
        
        return detailService.save(detalleActual);
    }
    
    @DeleteMapping("/detalles/{id}")
    public void eliminar(@PathVariable Integer id){
        detailService.delete(id);
    }
}
