package com.be.senai.infoa.backend.projeto_empreendedor.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  
@Table(name ="produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String datadefabricacao;
    private double preco;
    
    public Produto() {
    }

    public Produto(String nome, String datadefabricacao, double preco) {
        this.nome = nome;
        this.datadefabricacao = datadefabricacao;
        this.preco = preco;
    }

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

    public String getDatadefabricacao() {
        return datadefabricacao;
    }

    public void setDatadefabricacao(String datadefabricacao) {
        this.datadefabricacao = datadefabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
}
