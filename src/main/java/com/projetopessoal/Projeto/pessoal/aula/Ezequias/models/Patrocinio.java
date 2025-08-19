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
    Long idBanda;
    Long CPF;
    String contatoOficial;


    public Patrocinio(Long id, String nome, Long idBanda, Long CPF, String contatoOficial) {
        this.id = id;
        this.nome = nome;
        this.idBanda = idBanda;
        this.CPF = CPF;
        this.contatoOficial = contatoOficial;
    }

    public Patrocinio(PatrocinioDTO patrocinioDTO) {
        this.id = patrocinioDTO.getId();
        this.nome = patrocinioDTO.getNome();
        this.idBanda = patrocinioDTO.getIdBanda();
        this.CPF = patrocinioDTO.getCPF();
        this.contatoOficial = patrocinioDTO.getContatoOficial();
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Patrocinio that = (Patrocinio) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(idBanda, that.idBanda) && Objects.equals(CPF, that.CPF) && Objects.equals(contatoOficial, that.contatoOficial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, idBanda, CPF, contatoOficial);
    }
}
