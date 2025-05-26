package com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Integrante;

public class IntegranteDTO {
    
    private Long id;

    private String nome;

    private Long idBanda;

    public IntegranteDTO(Integrante integrante){
        this.id = integrante.getId();
        this.nome = integrante.getNome();
        this.idBanda = integrante.getIdBanda();
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

    public Long getIdBanda() {
        return idBanda;
    }

    public void setIdBanda(Long id) {
        this.idBanda = id;
    }
}
