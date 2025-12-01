package com.aprendendo.classesemetodosnapratica;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Pessoa p = new Pessoa();
        p.exibirDados("Iori");
        p.exibirDados(5,"Iori");





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        /* Funcionario funcionario = new Funcionario();
        funcionario.nome = "Felipe";
        funcionario.salario = 3500.00;

        double ss = funcionario.recuperarSalario(150.0, 20);
        System.out.println(ss);

        */

//        Casa casa = new Casa();
//        casa.cor = "verde";
//        System.out.println(casa.cor);
//        casa.abrirPorta();

    }



}