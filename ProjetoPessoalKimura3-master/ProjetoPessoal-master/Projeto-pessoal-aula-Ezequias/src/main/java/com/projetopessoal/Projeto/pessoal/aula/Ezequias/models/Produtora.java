package com.projetopessoal.Projeto.pessoal.aula.Ezequias.models;

import com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos.ProdutoraDTO;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "produtoras")
public class Produtora {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Long cpfCnpj;

    private String email;

    public Produtora() {
    }

    public Produtora(Long id, String nome, Long cpf_cnpj, String email) {
        this.id = id;
        this.nome = nome;
        this.cpfCnpj = cpf_cnpj;
        this.email = email;
    }

    public Produtora(ProdutoraDTO produtoraDTO) {
        this.id = produtoraDTO.getId();
        this.nome = produtoraDTO.getNome();
        this.cpfCnpj = produtoraDTO.getcpfCnpj();
        this.email = produtoraDTO.getEmail();
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

    public Long getcpfCnpj() {
        return cpfCnpj;
    }

    public void setcpfCnpj(Long cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produtora that = (Produtora) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(cpfCnpj, that.cpfCnpj) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cpfCnpj, email);
    }
}
