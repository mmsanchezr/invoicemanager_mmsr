/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smartsoft.invoicemanager.Service;

import com.smartsoft.invoicemanager.Dao.ClientDao;
import com.smartsoft.invoicemanager.Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author MSANCHEZ
 */

@Service
public class ClientServiceImplement implements ClientService {
    @Autowired
    private ClientDao clientDao;

    @Override
    @Transactional(readOnly=true)
    public List<Cliente> findAll(){
            return (List<Cliente>) clientDao.findAll();
    }

    @Override
    @Transactional(readOnly=false)
    public Cliente save(Cliente Cliente){
    
        return clientDao.save(Cliente);
    }

    @Override
    @Transactional(readOnly=true)
    public Cliente findById(Integer id){
        return clientDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id){
        clientDao.deleteById(id);
    }
    
    
}
