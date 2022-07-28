/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smartsoft.invoicemanager.Service;

import com.smartsoft.invoicemanager.Dao.InvoiceDao;
import com.smartsoft.invoicemanager.Model.Factura;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author MSANCHEZ
 */

@Service
public class InvoiceServiceImplement implements InvoiceService {
    @Autowired
    private InvoiceDao invoiceDao;

    @Override
    @Transactional(readOnly=true)
    public List<Factura> findAll(){
            return (List<Factura>) invoiceDao.findAll();
    }

    @Override
    @Transactional(readOnly=false)
    public Factura save(Factura factura){
    
        return invoiceDao.save(factura);
    }

    @Override
    @Transactional(readOnly=true)
    public Factura findById(Integer id){
        return invoiceDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id){
        invoiceDao.deleteById(id);
    }
    
    
}
