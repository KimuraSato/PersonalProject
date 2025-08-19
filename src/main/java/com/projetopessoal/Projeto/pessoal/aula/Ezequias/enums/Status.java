package com.projetopessoal.Projeto.pessoal.aula.Ezequias.enums;

public enum Status {

    ATIVO("Ativo"),
    INATIVO("Inativo"),
    HIATO("Em Hiato");

    private final String descricao;

    Status (String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){return descricao;}

}
