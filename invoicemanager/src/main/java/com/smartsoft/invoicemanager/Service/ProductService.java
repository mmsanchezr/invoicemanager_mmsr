/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.smartsoft.invoicemanager.Service;

import com.smartsoft.invoicemanager.Model.Producto;

import java.util.List;

/**
 *
 * @author MSANCHEZ
 */
public interface ProductService {
    public List<Producto> findAll();
    public Producto save(Producto producto);
    public Producto findById(Integer id);
    public void delete(Integer id);
}
