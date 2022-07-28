/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.smartsoft.invoicemanager.Service;

import com.smartsoft.invoicemanager.Model.Detalle;

import java.util.List;

/**
 *
 * @author MSANCHEZ
 */
public interface DetailService {
    public List<Detalle> findAll();
    public Detalle save(Detalle detalle);
    public Detalle findById(Integer id);
    public void delete(Integer id);
}
