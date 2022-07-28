/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smartsoft.invoicemanager.Controller;

import com.smartsoft.invoicemanager.Model.Cliente;
import com.smartsoft.invoicemanager.Service.ClientService;
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
public class ClientController {
    @Autowired
    private ClientService clientService;
    
    //listar
    @GetMapping("/clientes")
    public List<Cliente> listar(){
        return clientService.findAll();
    }
    
    //guardar
    @PostMapping("/clientes")
    public Cliente guardar(@RequestBody Cliente cliente){
        return clientService.save(cliente);
    }
    
    @GetMapping("/clientes/{id}")
    public Cliente getUnaCliente(@PathVariable Integer id){
        return clientService.findById(id);
    }
    
    //Editar
    @PutMapping("/clientes/{id}")
    public Cliente modificar (@RequestBody Cliente cliente,@PathVariable Integer id){
        Cliente clienteActual=clientService.findById(id);
        clienteActual.setId_cliente(cliente.getId_cliente());
        clienteActual.setNombre(cliente.getNombre());
        clienteActual.setApellido(cliente.getApellido());
        clienteActual.setEmail(cliente.getApellido());
        clienteActual.setFecha_nacimiento(cliente.getFecha_nacimiento());
        clienteActual.setEmail(cliente.getEmail());
        
        return clientService.save(clienteActual);
    }
    
    @DeleteMapping("/clientes/{id}")
    public void eliminar(@PathVariable Integer id){
        clientService.delete(id);
    }
}
