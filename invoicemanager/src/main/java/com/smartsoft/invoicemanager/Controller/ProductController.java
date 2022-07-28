/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smartsoft.invoicemanager.Controller;

import com.smartsoft.invoicemanager.Model.Producto;
import com.smartsoft.invoicemanager.Service.ProductService;
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
public class ProductController {
    @Autowired
    private ProductService productService;
    
    //listar
    @GetMapping("/productos")
    public List<Producto> listar(){
        return productService.findAll();
    }
    
    //guardar
    @PostMapping("/productos")
    public Producto guardar(@RequestBody Producto producto){
        return productService.save(producto);
    }
    
    @GetMapping("/productos/{id}")
    public Producto getUnaProducto(@PathVariable Integer id){
        return productService.findById(id);
    }
    
    //Editar
    @PutMapping("/productos/{id}")
    public Producto modificar (@RequestBody Producto producto,@PathVariable Integer id){
        Producto productoActual=productService.findById(id);
        productoActual.setId_producto(producto.getId_producto());
        productoActual.setNombre(producto.getNombre());
        productoActual.setPrecio(producto.getPrecio());
        productoActual.setStock(producto.getStock());
        
        return productService.save(productoActual);
    }
    
    @DeleteMapping("/productos/{id}")
    public void eliminar(@PathVariable Integer id){
        productService.delete(id);
    }
}
