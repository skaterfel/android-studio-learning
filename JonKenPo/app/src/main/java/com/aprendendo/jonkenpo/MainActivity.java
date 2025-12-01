package com.aprendendo.jonkenpo;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int pontosIANum = 0;
    int pontosHumanosNum = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    String opcaoSelecionadaAI = "";


    public void selecionadoPedra(View view){
        this.opcaoSelecionada("pedra");
    }
    public void selecionadoPapel(View view){
        this.opcaoSelecionada("papel");
    }
    public void selecionadoTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }





    public void opcaoIA(){
        String[] opcoes = {"pedra", "papel", "tesoura"};
        int numeroAleatorio = new Random().nextInt(opcoes.length);
        opcaoSelecionadaAI = opcoes[numeroAleatorio];
        ImageView imgIA = findViewById(R.id.imgAppEscolha);
        int idImagem = getResources().getIdentifier(
                opcaoSelecionadaAI,"drawable",getPackageName()
        );
        imgIA.setImageResource(idImagem);
    }
    public void opcaoSelecionada(String opcaoSelecionada){
        TextView res = findViewById(R.id.resPartida);
        opcaoIA();
        String opcaoIA = opcaoSelecionadaAI;

        if (opcaoSelecionada.equals(opcaoIA)){
            res.setText("Partida empatada! :D");

        } else if (opcaoSelecionada.equals("tesoura") && opcaoIA.equals("papel")||
                   opcaoSelecionada.equals("pedra")  && opcaoIA.equals("tesoura") ||
                   opcaoSelecionada.equals("papel")  && opcaoIA.equals("pedra")){
            res.setText("Você ganhou Parabéns!!! xD");
            TextView pontosHumanos = findViewById(R.id.pontosHumanos);

            pontosHumanos.setText(String.valueOf(pontosHumanosNum+1));
            pontosHumanosNum++;

        } else {
            res.setText("Você perdeu! :/");

            TextView pontosIA = findViewById(R.id.pontosIA);
            pontosIA.setText(String.valueOf(pontosIANum+1));
        pontosIANum++;
    }


    }
}