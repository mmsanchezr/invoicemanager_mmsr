/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.smartsoft.invoicemanager.Dao;

import com.smartsoft.invoicemanager.Model.Detalle;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author MSANCHEZ
 */
public interface DetailDao extends CrudRepository<Detalle,Integer> {
    
}
