package com.projetopessoal.Projeto.pessoal.aula.Ezequias.enums;

public enum Nacao {

    EXILED_KINGDOM("Exiled Kingdom", "EK"),
    ERYA("Erya", "ER"),
    ASKAR("Askar", "AS"),
    MOONSHADE("Moonshade", "MS"),
    LIONES("Liones", "LI"),
    ALCANA("Alcana", "AL"),
    ALTEA("Altea", "AT"),
    NEVERLAND("Neverland", "NL"),
    TALIS("Talis", "TL"),
    EVERMORE("Evermore", "EM"),
    LUNARIA("Lunaria", "LU"),
    BELMORE("Belmore", "BE");

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
