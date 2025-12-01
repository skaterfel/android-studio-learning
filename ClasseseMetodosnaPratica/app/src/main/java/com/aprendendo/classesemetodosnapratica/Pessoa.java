package com.aprendendo.classesemetodosnapratica;

public class Pessoa {
    private String nome;
    private int idade;

    public void exibirDados(String nome){
        System.out.println("Exibir apenas nome: " + nome);
    }

    public void exibirDados(int idade, String nome){
        System.out.println("Nome: " + nome + " | Idade: " + idade);
    }
}
