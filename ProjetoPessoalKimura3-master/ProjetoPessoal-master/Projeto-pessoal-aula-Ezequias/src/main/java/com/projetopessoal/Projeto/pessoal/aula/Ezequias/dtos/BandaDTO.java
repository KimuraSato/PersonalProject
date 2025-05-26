package com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.enums.Nacao;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Banda;

import java.time.LocalDate;

public class BandaDTO {

    private Long id;
    private String nome;
    private Nacao nacao;
    private String email;
    private String senha;
    private String cpf;
    private LocalDate dataNascimento;
    private String perfil;
    private Boolean verificado;

    public BandaDTO() {}

    public BandaDTO(Banda banda) {
        this.id = banda.getId();
        this.nome = banda.getNome();
        this.nacao = banda.getNacao();
        this.email = banda.getEmail();
        this.senha = banda.getSenha();
        this.cpf = banda.getCpf();
        this.dataNascimento = banda.getDataNascimento();
        this.perfil = banda.getPerfil();
        this.verificado = banda.getVerificado();
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

    public Nacao getNacao() {
        return nacao;
    }

    public void setNacao(Nacao nacao) {
        this.nacao = nacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public Boolean getVerificado() {
        return verificado;
    }

    public void setVerificado(Boolean verificado) {
        this.verificado = verificado;
    }
}
