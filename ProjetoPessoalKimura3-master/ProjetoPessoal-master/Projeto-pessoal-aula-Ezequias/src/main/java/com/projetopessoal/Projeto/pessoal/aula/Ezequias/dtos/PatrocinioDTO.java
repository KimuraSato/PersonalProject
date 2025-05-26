package com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Patrocinio;

public class PatrocinioDTO {

    private Long id;
    private String nome;
    private Long idBanda;

    public PatrocinioDTO() {}

    public PatrocinioDTO(Patrocinio patrocinio) {
        this.id = patrocinio.getId();
        this.nome = patrocinio.getNome();
        this.idBanda = patrocinio.getIdBanda();
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