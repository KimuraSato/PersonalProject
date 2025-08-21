package com.projetopessoal.Projeto.pessoal.aula.Ezequias.models;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.BandaDTO;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.enums.GeneroMusical;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.enums.Nacao;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.enums.Status;
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
    private GeneroMusical generoMusical;
    private Date dataCriacao;
    private Status status;

    public Banda() {
    }

    public Banda(Long id, String nome, Nacao nacao, GeneroMusical generoMusical, Date dataCriacao, Status status ) {
        this.id = id;
        this.nome = nome;
        this.nacao = nacao;
        this.generoMusical = generoMusical;
        this.dataCriacao = new Date();
        this.status = status;
    }

    public Banda(BandaDTO bandaDTO) {
        this.id = bandaDTO.getId();
        this.nome = bandaDTO.getNome();
        this.nacao = bandaDTO.getNacao();
        this.generoMusical = bandaDTO.getGeneroMusical();
        this.dataCriacao = bandaDTO.getDataCriacao();
        this.status = bandaDTO.getStatus();
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

    public GeneroMusical getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(GeneroMusical generoMusical) {
        this.generoMusical = generoMusical;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Banda banda = (Banda) o;
        return Objects.equals(id, banda.id) && Objects.equals(nome, banda.nome) && nacao == banda.nacao && Objects.equals(generoMusical, banda.generoMusical) && Objects.equals(dataCriacao, banda.dataCriacao) && status == banda.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, nacao, generoMusical, dataCriacao, status);
    }
}