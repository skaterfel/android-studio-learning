package com.aprendendo.classesemetodosnapratica;

class Funcionario {

    String nome;
    double salario;



    double recuperarSalario(double bonus, double descontoAdd){
        this.salario = this.salario - (this.salario * .1);
        return this.salario + bonus - descontoAdd;
        //    System.out.println("Salario: R$ " + this.salario );
    }
}
