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

    @RequestMapping(value = "/AddClient",method= RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cliente CreateClient(@RequestBody Cliente cliente) {
        System.out.println("Invocando al metodo POST :0");
        return clientBl.createClient(cliente);
    }
    @RequestMapping(value = "/DeleteClient/{CC}",method= RequestMethod.DELETE)
    public String DeleteClient(@PathVariable("CC") Integer CC) {
        try {
            clientBl.deleteClient(CC);
            return "Borrado correcto";
        }
        catch (Exception e){
            return ("Borrado no logrado ");
        }
    }
    @RequestMapping(value = "/ChangeClient",method= RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cliente ChangeClient(@RequestBody Cliente cliente) {
        System.out.println("Invocando al metodo PUT :0");
        return clientBl.changeClient(cliente);
    }
    @RequestMapping(value = "/FindProv/{CC}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Cliente ChangeClient(@PathVariable("CC") Integer CC) {
        return clientBl.searchClient(CC);
    }
}
