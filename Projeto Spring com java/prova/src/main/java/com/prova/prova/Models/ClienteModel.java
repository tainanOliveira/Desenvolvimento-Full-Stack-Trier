package com.prova.prova.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;

import java.util.Objects;

@Entity
@Table(name = "TBcliente")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define a estratégia para o ID ser gerado automaticamente
    private Long id;

    @Column(name = "Name", unique = false) // 'Name' é um nome comum, mas deve ser consistente com o padrão de nomenclatura.
    private String nome;

    @Column(name = "Email", unique = true) // Certificando que o email é único
    private String email;

    @Column(name = "Telefone", unique = false) // O telefone não deve ser único, a menos que seja um requisito de negócios
    private String telefone;

    @Column(name = "Idade", unique = false) // Corrigido para 'Idade', já que 'yers' era um erro de digitação
    private Integer idade;

    @Column(name = "Cpf", unique = true) // O CPF deve ser único para cada cliente
    @Pattern(regexp = "^[0-9]{11}$", message = "O CPF deve ter 11 dígitos numéricos")
    private String cpf;

    // Construtor padrão
    public ClienteModel() {
    }

    // Construtor com parâmetros
    public ClienteModel(Long id, String nome, String email, String telefone, Integer idade, String cpf) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
        this.cpf = cpf;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ClienteModel that = (ClienteModel) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }
}
