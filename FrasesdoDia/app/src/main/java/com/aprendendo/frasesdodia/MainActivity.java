package com.aprendendo.frasesdodia;

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

    public void gerarNovaFrase(View view){
        String[] frases = {
                "Não espere. O tempo nunca será perfeito",
                "Se você não está disposto a arriscar, esteja disposto a uma vida comum.",
                "A melhor maneira de ter uma boa ideia é ter muitas.",
                "O fracasso é a oportunidade de começar de novo com mais inteligência.",
                "Nunca é tarde demais para ser o que você poderia ter sido."
        };
        TextView textAppFrase = findViewById(R.id.textGerarNovaFrase);
        int s = new Random().nextInt(frases.length);
        textAppFrase.setText((s+1)+ " - " +frases[s]);

    }
}