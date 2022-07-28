/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.smartsoft.invoicemanager.Dao;

import com.smartsoft.invoicemanager.Model.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author MSANCHEZ
 */
public interface ClientDao extends CrudRepository<Cliente,Integer> {
    
}
