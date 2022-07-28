/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smartsoft.invoicemanager.Controller;

import com.smartsoft.invoicemanager.Model.Factura;
import com.smartsoft.invoicemanager.Service.InvoiceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MSANCHEZ
 */
@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;
    
    //listar
    @GetMapping("/facturas")
    public List<Factura> listar(){
        return invoiceService.findAll();
    }
    
    //guardar
    @PostMapping("/facturas")
    public Factura guardar(@RequestBody Factura factura){
        return invoiceService.save(factura);
    }
    
    @GetMapping("/facturas/{id}")
    public Factura getUnaFactura(@PathVariable Integer id){
        return invoiceService.findById(id);
    }
    
    //Editar
    @PutMapping("/facturas/{id}")
    public Factura modificar (@RequestBody Factura factura,@PathVariable Integer id){
        Factura facturaActual=invoiceService.findById(id);
        facturaActual.setId_cliente(factura.getId_cliente());
        facturaActual.setFecha(factura.getFecha());
        
        return invoiceService.save(facturaActual);
    }
    
    @DeleteMapping("/facturas/{id}")
    public void eliminar(@PathVariable Integer id){
        invoiceService.delete(id);
    }
}
