package com.projetopessoal.Projeto.pessoal.aula.Ezequias.models;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.IntegranteDTO;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "integrantes")
public class Integrante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String nomeArtistico;

    private Long idBanda;

    private Long CPF;

    private String email;

    private String telefone;

    private Date dataEntrada;

    private Date dataNascimento;


    @ManyToOne
    @JoinColumn(name = "banda_id")
    private Banda banda;

    public Integrante(Long id, String nome, Long idBanda, String nomeArtistico, Long CPF, String email, String telefone, Date dataEntrada, Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.idBanda = idBanda;
        this.nomeArtistico = nomeArtistico;
        this.CPF = CPF;
        this.email = email;
        this.telefone = telefone;
        this.dataEntrada = dataEntrada;
        this.dataNascimento = dataNascimento;
    }

    public Integrante(IntegranteDTO integranteDTO) {
        this.id = integranteDTO.getId();
        this.nome = integranteDTO.getNome();
        this.idBanda = integranteDTO.getIdBanda();
        this.nomeArtistico = integranteDTO.getNomeArtistico();
        this.CPF = integranteDTO.getCPF();
        this.email = integranteDTO.getEmail();
        this.telefone = integranteDTO.getTelefone();
        this.dataEntrada = integranteDTO.getDataEntrada();
        this.dataNascimento = integranteDTO.getDataNascimento();
    }

    public Integrante() {

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

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Integrante that = (Integrante) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(nomeArtistico, that.nomeArtistico) && Objects.equals(idBanda, that.idBanda) && Objects.equals(CPF, that.CPF) && Objects.equals(email, that.email) && Objects.equals(telefone, that.telefone) && Objects.equals(dataEntrada, that.dataEntrada) && Objects.equals(dataNascimento, that.dataNascimento) && Objects.equals(banda, that.banda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, nomeArtistico, idBanda, CPF, email, telefone, dataEntrada, dataNascimento, banda);
    }
}
