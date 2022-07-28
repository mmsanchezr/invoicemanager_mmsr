/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.smartsoft.invoicemanager.Service;

import com.smartsoft.invoicemanager.Model.Cliente;

import java.util.List;

/**
 *
 * @author MSANCHEZ
 */
public interface ClientService {
    public List<Cliente> findAll();
    public Cliente save(Cliente cliente);
    public Cliente findById(Integer id);
    public void delete(Integer id);
}
