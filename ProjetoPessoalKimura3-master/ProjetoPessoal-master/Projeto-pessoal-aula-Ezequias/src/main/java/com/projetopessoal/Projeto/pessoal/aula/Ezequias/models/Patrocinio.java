package com.projetopessoal.Projeto.pessoal.aula.Ezequias.models;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.PatrocinioDTO;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Patrocinios")
public class Patrocinio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    Long idbanda;


    public Patrocinio(Long id, String nome, Long idbanda) {
        this.id = id;
        this.nome = nome;
        this.idbanda = idbanda;
    }

    public Patrocinio(PatrocinioDTO patrocinioDTO) {
        this.id = patrocinioDTO.getId();
        this.nome = patrocinioDTO.getNome();
        this.idbanda = patrocinioDTO.getIdBanda();
    }

    public Patrocinio() {

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
        return idbanda;
    }

    public void setIdBanda(Long id) {
        this.idbanda = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Patrocinio that = (Patrocinio) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(idbanda, that.idbanda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, idbanda);
    }
}