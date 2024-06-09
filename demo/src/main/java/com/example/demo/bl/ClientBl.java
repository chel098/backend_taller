package com.example.demo.bl;

import com.example.demo.dao.ClientDao;
import com.example.demo.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientBl {
    @Autowired
    private ClientDao clientDao;

    public List<Cliente> getClientList(){
        return clientDao.findAll();
    }
    public Cliente createClient (Cliente client){
        return clientDao.save(client);
    }
    public void deleteClient (Integer CC){
        clientDao.deleteById( CC);
    }
    public Cliente changeClient(Cliente client){
        return clientDao.save(client);
    }
    public Cliente searchClient(Integer CC){
        return clientDao.findById(CC).get();
    }
}
