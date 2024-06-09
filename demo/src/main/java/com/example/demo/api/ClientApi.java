package com.example.demo.api;

import com.example.demo.bl.ClientBl;
import com.example.demo.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/v1")
public class ClientApi {
    private ClientBl clientBl;
    @Autowired
    public ClientApi(ClientBl clientBl) {
        this.clientBl = clientBl;
    }
    @RequestMapping(value = "/ClientList",method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Cliente> listAll() {
        System.out.println("Invocando al metodo GET :0");
        return clientBl.getClientList();
    }
}
