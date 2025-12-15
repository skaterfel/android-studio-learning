package com.aprendendo.classesemetodosnapratica;

public class Keitaro extends Cidadao implements Presidente{

    @Override
    public void ganharEleicao() {
        System.out.println("pode ser presidente nos EUA.");
    }
}
