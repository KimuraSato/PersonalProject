package com.projetopessoal.Projeto.pessoal.aula.Ezequias.enums;

public enum Nacao {

    ROTR("Rotr", "Ro"),
    AMAI("Amai", "Am"),
    VAELORA("Vaelora", "Va"),
    CORINTH("Corinth", "Co"),
    ATALAN("Atalan", "At"),
    DUNWALL("Dunwall", "Du");

    private final String descricao;
    private final String sigla;

    Nacao(String descricao, String sigla){
        this.descricao = descricao;
        this.sigla = sigla;
    }

    public String getDescricao(){return descricao;}
    public String getSigla(){return sigla;}

    public static Nacao obterPorSigla(String sigla) {
        for (Nacao nacao : Nacao.values()) {
            if (nacao.getSigla().equalsIgnoreCase(sigla)) {
                return nacao;
            }
        }
        return null;
    }
}