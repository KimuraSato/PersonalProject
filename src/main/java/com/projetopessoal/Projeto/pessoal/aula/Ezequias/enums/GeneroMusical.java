package com.projetopessoal.Projeto.pessoal.aula.Ezequias.enums;

public enum GeneroMusical {

    ROCK("Rock"),
    POP("Pop"),
    JAZZ("Jazz"),
    HIPHOP("Hiphop"),
    CLASSICAL("Classical");

    private final String descricao;

    GeneroMusical(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){return descricao;}
}
