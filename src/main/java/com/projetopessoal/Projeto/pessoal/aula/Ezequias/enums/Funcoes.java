package com.projetopessoal.Projeto.pessoal.aula.Ezequias.enums;

public enum Funcoes {

    VOCALISTA("Vocalista"),
    GUITARRISTA("Guitarrista"),
    BAIXISTA("Baixista"),
    BATERISTA("Baterista"),
    TECLADISTA("Tecladista"),
    PERCUSSIONISTA("Percussionista");

    private final String descricao;

    Funcoes (String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){return descricao;}
}
