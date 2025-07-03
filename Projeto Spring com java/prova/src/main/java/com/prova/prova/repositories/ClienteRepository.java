package com.prova.prova.repositories;

import com.prova.prova.Models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {


    ClienteModel findByCpf(String cpf);

 }
