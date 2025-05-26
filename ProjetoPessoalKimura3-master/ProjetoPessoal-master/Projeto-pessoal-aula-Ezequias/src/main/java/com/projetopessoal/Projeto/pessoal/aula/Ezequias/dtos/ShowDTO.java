package com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.enums.Nacao;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.models.Show;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class ShowDTO {
    private Long id;

    private String nome;

    private LocalDate data;

    private Long idprodutoras;

    private String descricao;

    private LocalTime horarioInicio;

    @Enumerated(EnumType.STRING)
    private Nacao nacao;

    public ShowDTO(Show show) {
        this.id = show.getId();
        this.data = show.getData();
        this.idprodutoras = show.getIdprodutoras();
        this.descricao = show.getDescricao();
        this.horarioInicio = show.gethorarioInicio();
        this.nacao = show.getNacao();
    }

    public ShowDTO() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Long getIdprodutoras() {
        return idprodutoras;
    }

    public void setIdprodutoras(Long idprodutoras) {
        this.idprodutoras = idprodutoras;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalTime gethorarioInicio() {
        return horarioInicio;
    }

    public void sethorarioInicio(LocalTime horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Nacao getNacao() {
        return nacao;
    }

    public void setNacao(Nacao nacao) {
        this.nacao = nacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
