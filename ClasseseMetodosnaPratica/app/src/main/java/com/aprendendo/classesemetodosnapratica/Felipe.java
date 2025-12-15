package com.aprendendo.classesemetodosnapratica;

public class Felipe extends Cidadao implements Presidente{

    @Override
    public void ganharEleicao() {
        System.out.println("pode ser presidente nos BR.");
    }
}
