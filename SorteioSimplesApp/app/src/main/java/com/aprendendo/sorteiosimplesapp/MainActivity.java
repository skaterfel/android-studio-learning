package com.aprendendo.sorteiosimplesapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

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

    public void sorteador(View view){


        TextView textView = findViewById(R.id.textoSorteado);
        // Random random = new Random();
        //textView.setText("O GANHADOR É: " + random.nextInt(11));
        //pode ser usado tambem da forma abaixo, sem precisar intanciar a classe Random:
        textView.setText("O GANHADOR É O NÚMERO: " + new Random().nextInt(11));
    }


}