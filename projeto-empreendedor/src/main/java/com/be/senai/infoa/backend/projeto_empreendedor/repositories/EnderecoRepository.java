package com.be.senai.infoa.backend.projeto_empreendedor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.be.senai.infoa.backend.projeto_empreendedor.models.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
    
}