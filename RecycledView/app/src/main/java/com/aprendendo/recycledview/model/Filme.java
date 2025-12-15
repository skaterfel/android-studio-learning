package com.aprendendo.recycledview.model;

public class Filme {
    private String titulo;
    private String genero;
    private String ano;

    public Filme(String titulo, String genero, String ano) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
    }

    public  Filme(){

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
