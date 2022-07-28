/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.smartsoft.invoicemanager.Service;

import com.smartsoft.invoicemanager.Model.Factura;
import java.util.List;

/**
 *
 * @author MSANCHEZ
 */
public interface InvoiceService {
    public List<Factura> findAll();
    public Factura save(Factura factura);
    public Factura findById(Integer id);
    public void delete(Integer id);
}
