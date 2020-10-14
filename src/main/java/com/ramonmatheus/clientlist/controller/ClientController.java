package com.ramonmatheus.clientlist.controller;

import com.ramonmatheus.clientlist.model.Client;
import com.ramonmatheus.clientlist.repository.ClientRepository;
import com.ramonmatheus.clientlist.service.implement.ClientServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientServiceImplement clientServiceImplement;

    @GetMapping
    public List<Client> getAllClients(){
        return clientServiceImplement.getAllClients();
    }
    @GetMapping("/{idClient}")
    public Optional<Client> getClientById(@PathVariable int idClient){
        return clientServiceImplement.getClientById(idClient);
    }
    @DeleteMapping("/{idClient}")
    public String deleteClientById(@PathVariable int idClient){
        clientServiceImplement.deleteClientById(idClient);
        return "Completed";
    }
    @PostMapping("/save")
    public String saveClient(@RequestBody Client client){
        clientServiceImplement.saveClient(client);
        return "Completed";
    }
}
