package com.projetopessoal.Projeto.pessoal.aula.Ezequias.models;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.IntegranteDTO;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "integrantes")
public class Integrante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Long idBanda;

    @ManyToOne
    @JoinColumn(name = "banda_id")
    private Banda banda;

    public Integrante(Long id, String nome, Long idBanda){
        this.id = id;
        this.nome = nome;
        this.idBanda = idBanda;
    }

    public Integrante(IntegranteDTO integranteDTO) {
        this.id = integranteDTO.getId();
        this.nome = integranteDTO.getNome();
        this.idBanda = integranteDTO.getIdBanda();
    }

    public Integrante() {

    }

    public Long getId(){
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

    public Long getIdBanda(){
        return idBanda;
    }

    public void setIdBanda(Long id) {
        this.idBanda = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Integrante that = (Integrante) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(idBanda, that.idBanda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, idBanda);
    }
}