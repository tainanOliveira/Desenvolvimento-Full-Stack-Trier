package com.prova.prova.controllers;

import com.prova.prova.Models.ClienteModel;
import com.prova.prova.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    // Endpoint para salvar um cliente
    @PostMapping
    public ClienteModel criarCliente(@RequestBody ClienteModel cliente) {
        return clienteService.salvarCliente(cliente);
    }

    // Endpoint para listar todos os clientes
    @GetMapping
    public List<ClienteModel> listarClientes() {
        return clienteService.listarClientes();
    }

    // Endpoint para buscar cliente por ID
    @GetMapping("/{id}")
    public Optional<ClienteModel> getClienteById(@PathVariable Long id) {
        return clienteService.buscarClientePorId(id);
    }

    // Endpoint para buscar cliente por CPF
    @GetMapping("/cpf/{cpf}")
    public ClienteModel getClienteByCpf(@PathVariable String cpf) {
        return clienteService.buscarClientePorCpf(cpf);
    }

    // Endpoint para deletar um cliente
    @DeleteMapping("/{id}")
    public void deletarCliente(@PathVariable Long id) {
        clienteService.deletarCliente(id);
    }
}
