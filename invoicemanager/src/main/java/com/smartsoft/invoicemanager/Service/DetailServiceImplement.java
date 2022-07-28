/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smartsoft.invoicemanager.Service;

import com.smartsoft.invoicemanager.Dao.DetailDao;
import com.smartsoft.invoicemanager.Model.Detalle;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author MSANCHEZ
 */

@Service
public class DetailServiceImplement implements DetailService {
    @Autowired
    private DetailDao clientDao;

    @Override
    @Transactional(readOnly=true)
    public List<Detalle> findAll(){
            return (List<Detalle>) clientDao.findAll();
    }

    @Override
    @Transactional(readOnly=false)
    public Detalle save(Detalle Detalle){
    
        return clientDao.save(Detalle);
    }

    @Override
    @Transactional(readOnly=true)
    public Detalle findById(Integer id){
        return clientDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id){
        clientDao.deleteById(id);
    }
    
    
}
