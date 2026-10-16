package com.be.senai.infoa.backend.projeto_empreendedor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.be.senai.infoa.backend.projeto_empreendedor.services.EmpreendedorService;

@RestController 
@RequestMapping("/empreendedor")
public class EmpreendedorController {
    
    @Autowired 
    private EmpreendedorService empreendedorService;

    @GetMapping("/contar")
    public Long contar() {
        return empreendedorService.contar();
    }

    @GetMapping ("/buscar/{id}")
    public empreendedorService.buscarPorId(@PathVariable Integer id) {
        return empreendedorService.buscarPorId(id);
    }
}