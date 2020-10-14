package com.ramonmatheus.clientlist.repository;

import com.ramonmatheus.clientlist.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
