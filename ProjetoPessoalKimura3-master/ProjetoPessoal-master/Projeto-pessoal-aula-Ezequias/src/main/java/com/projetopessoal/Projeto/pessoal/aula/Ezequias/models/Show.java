package com.projetopessoal.Projeto.pessoal.aula.Ezequias.models;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.ShowDTO;
import com.projetopessoal.Projeto.pessoal.aula.Ezequias.enums.Nacao;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table (name = "shows")
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private LocalDate data;

    private Long idprodutoras;

    private String descricao;

    private LocalTime horarioInicio;

    @Enumerated(EnumType.STRING)
    private Nacao nacao;

    public Show(ShowDTO showDTO) {
        this.nome = showDTO.getNome();
        this.data = showDTO.getData();
        this.idprodutoras = showDTO.getIdprodutoras();
        this.descricao = showDTO.getDescricao();
        this.horarioInicio = showDTO.gethorarioInicio();
        this.nacao = showDTO.getNacao();
    }

    public Show() {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Show show = (Show) o;
        return Objects.equals(id, show.id) && Objects.equals(data, show.data) && Objects.equals(idprodutoras, show.idprodutoras) && Objects.equals(descricao, show.descricao) && Objects.equals(horarioInicio, show.horarioInicio) && Objects.equals(nacao, show.nacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data, idprodutoras, descricao, horarioInicio, nacao);
    }
}
