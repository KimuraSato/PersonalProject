package com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.enums.Nacao;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.enums.Status;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Banda;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class BandaDTO {

    private Long id;
    private String nome;
    private Nacao nacao;
    private String generoMusical;
    private Date dataCriacao;
    private Status status;

    public BandaDTO() {}

    public BandaDTO(Banda banda) {
        this.id = banda.getId();
        this.nome = banda.getNome();
        this.nacao = banda.getNacao();
        this.generoMusical = banda.getGeneroMusical();
        this.dataCriacao = banda.getDataCriacao();
        this.status = banda.getStatus();
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

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
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
        BandaDTO bandaDTO = (BandaDTO) o;
        return Objects.equals(id, bandaDTO.id) && Objects.equals(nome, bandaDTO.nome) && nacao == bandaDTO.nacao && Objects.equals(generoMusical, bandaDTO.generoMusical) && Objects.equals(dataCriacao, bandaDTO.dataCriacao) && status == bandaDTO.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, nacao, generoMusical, dataCriacao, status);
    }
}
