package com.prova.prova.Models;

import jakarta.persistence.*;

@Entity
@Table(name="TBveiculo")
public class Veiculo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define a estratégia para o ID ser gerado automaticamente
    private Long id;

    @Column(name="Descrição", unique = true)
    private String descricao;

    @Column(name="ValorVeiculo",unique = false)
    private Double valor;

    @Column(name="Observação",unique = false)
    private String observacao;


    public Veiculo() {
    }

    public Veiculo(Long id, String descricao, Double valor, String observacao) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.observacao = observacao;
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
