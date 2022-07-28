/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smartsoft.invoicemanager.Service;

import com.smartsoft.invoicemanager.Dao.ProductDao;
import com.smartsoft.invoicemanager.Model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author MSANCHEZ
 */

@Service
public class ProductServiceImplement implements ProductService {
    @Autowired
    private ProductDao clientDao;

    @Override
    @Transactional(readOnly=true)
    public List<Producto> findAll(){
        return (List<Producto>) clientDao.findAll();
    }

    @Override
    @Transactional(readOnly=false)
    public Producto save(Producto Producto){

        return clientDao.save(Producto);
    }

    @Override
    @Transactional(readOnly=true)
    public Producto findById(Integer id){
        return clientDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id){
        clientDao.deleteById(id);
    }


}
