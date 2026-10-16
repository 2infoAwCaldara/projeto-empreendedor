package com.be.senai.infoa.backend.projeto_empreendedor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.be.senai.infoa.backend.projeto_empreendedor.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    
}