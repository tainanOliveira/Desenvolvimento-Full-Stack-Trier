package com.prova.prova.Models;

import jakarta.persistence.*;

@Entity
@Table(name="TBpecas")
public class Peca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define a estratégia para o ID ser gerado automaticamente
    private Long id;

    @Column(name = "Name", unique = false) // 'Name' é um nome comum, mas deve ser consistente com o padrão de nomenclatura.
    private String nome;

    @Column(name="Descrição", unique = false)
    private String descricao;

    @Column(name="ValorPeça",unique = false)
    private Double valor;


    public Peca() {
    }

    public Peca(Long id, String nome, String descricao, Double valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrição() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrição(String descrição) {
        this.descricao = descrição;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
