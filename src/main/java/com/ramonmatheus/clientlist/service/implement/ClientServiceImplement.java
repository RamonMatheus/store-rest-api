package com.ramonmatheus.clientlist.service.implement;

import com.ramonmatheus.clientlist.model.Client;
import com.ramonmatheus.clientlist.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImplement {

    @Autowired
    ClientRepository clientRepository;


    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }


    public Optional<Client> getClientById(int idClient) {
        return clientRepository.findById(idClient);
    }


    public String deleteClientById(int idClient) {
        clientRepository.deleteById(idClient);
        return "Completed";
    }

    public String saveClient(Client client) {
        clientRepository.save(client);
        return "Completed";
    }
}
