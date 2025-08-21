package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10;

    private String titulo;
    private String descricao;

    public abstract double calcularXP();

    public String getTitulo(){
        return this.titulo;
    }
    public String getDescricao(){
        return this.descricao;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}
