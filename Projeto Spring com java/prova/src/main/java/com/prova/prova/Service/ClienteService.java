package com.prova.prova.Service;

import com.prova.prova.Models.ClienteModel;
import com.prova.prova.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    // Injeção de dependência do repositório
    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // Método para salvar um cliente
    public ClienteModel salvarCliente(ClienteModel cliente) {
        return clienteRepository.save(cliente); // Salva ou atualiza o cliente
    }

    // Método para listar todos os clientes
    public List<ClienteModel> listarClientes() {
        return clienteRepository.findAll(); // Retorna todos os clientes
    }

    // Método para buscar um cliente pelo ID
    public Optional<ClienteModel> buscarClientePorId(Long id) {
        return clienteRepository.findById(id); // Retorna o cliente com o ID especificado
    }

    // Método para buscar um cliente pelo CPF
    public ClienteModel buscarClientePorCpf(String cpf) {
        return clienteRepository.findByCpf(cpf); // Retorna o cliente com o CPF especificado
    }

    // Método para deletar um cliente pelo ID
    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id); // Deleta o cliente com o ID especificado
    }
}
