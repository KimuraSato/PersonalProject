package com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Patrocinio;

public class PatrocinioDTO {

    Long id;
    String nome;
    Long idBanda;
    Long CPF;
    String contatoOficial;

    public PatrocinioDTO() {}

    public PatrocinioDTO(Patrocinio patrocinio) {
        this.id = patrocinio.getId();
        this.nome = patrocinio.getNome();
        this.idBanda = patrocinio.getIdBanda();
        this.CPF = patrocinio.getCPF();
        this.contatoOficial = patrocinio.getContatoOficial();
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

    public void setIdBanda(Long idBanda) {
        this.idBanda = idBanda;
    }

    public Long getCPF() {
        return CPF;
    }

    public void setCPF(Long CPF) {
        this.CPF = CPF;
    }

    public String getContatoOficial() {
        return contatoOficial;
    }

    public void setContatoOficial(String contatoOficial) {
        this.contatoOficial = contatoOficial;
    }
}