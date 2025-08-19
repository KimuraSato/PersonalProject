package com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Integrante;

import java.util.Date;

public class IntegranteDTO {

    private Long id;

    private String nome;

    private String nomeArtistico;

    private Long idBanda;

    private Long CPF;

    private String email;

    private String telefone;

    private Date dataEntrada;

    private Date dataNascimento;


    public IntegranteDTO() {
    }

    public IntegranteDTO(Integrante integrante){
        this.id = integrante.getId();
        this.nome = integrante.getNome();
        this.idBanda = integrante.getIdBanda();
        this.CPF = integrante.getCPF();
        this.email = integrante.getEmail();
        this.telefone = integrante.getTelefone();
        this.dataEntrada = integrante.getDataEntrada();
        this.dataNascimento = integrante.getDataNascimento();
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

    public String getNomeArtistico() {
        return nomeArtistico;
    }

    public void setNomeArtistico(String nomeArtistico) {
        this.nomeArtistico = nomeArtistico;
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

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}