package com.projetopessoal.Projeto.pessoal.aula.Ezequias.models;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.BandaDTO;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.enums.Nacao;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "banda")
public class Banda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Nacao nacao;
    @Column(unique = true)
    private String email;
    private String senha;

    @Column(unique = true)
    private String cpf;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    private String perfil;
    private Boolean verificado;

    public Banda() {
    }

    public Banda(Long id, String nome, Nacao nacao, String email, String senha, String cpf, String perfil, Boolean verificado) {
        this.id = id;
        this.nome = nome;
        this.nacao = nacao;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.perfil = perfil;
        this.verificado = verificado;
    }

    public Banda(BandaDTO bandaDTO) {
        this.id = bandaDTO.getId();
        this.nome = bandaDTO.getNome();
        this.nacao = bandaDTO.getNacao();
        this.email = bandaDTO.getEmail();
        this.senha = bandaDTO.getSenha();
        this.cpf = bandaDTO.getCpf();
        this.dataNascimento = bandaDTO.getDataNascimento();
        this.perfil = bandaDTO.getPerfil();
        this.verificado = bandaDTO.getVerificado();
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Banda banda = (Banda) o;
        return Objects.equals(id, banda.id) && Objects.equals(nome, banda.nome) && nacao == banda.nacao && Objects.equals(email, banda.email) && Objects.equals(senha, banda.senha) && Objects.equals(cpf, banda.cpf) && Objects.equals(dataNascimento, banda.dataNascimento) && Objects.equals(perfil, banda.perfil) && Objects.equals(verificado, banda.verificado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, nacao, email, senha, cpf, dataNascimento, perfil, verificado);
    }
}
