package com.projetopessoal.Projeto.pessoal.aula.Ezequias.dtos;

public class ProdutoraDTO {

    private Long id;
    private String nome;
    private Long cpfCnpj;
    private String email;

    public ProdutoraDTO() {
    }

    public ProdutoraDTO(Long id, String nome, Long cpfCnpj, String email) {
        this.id = id;
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.email = email;
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
}
