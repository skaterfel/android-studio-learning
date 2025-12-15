package com.aprendendo.progressbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBarH, progressBarC;
    private Integer progresso = 0;

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
        progressBarH = findViewById(R.id.progressBarH);
        progressBarC = findViewById(R.id.progressBarC);

        progressBarC.setVisibility(View.GONE);

    }
    public void carregar(View view){

        this.progresso++;
        progressBarH.setProgress(this.progresso);
        progressBarC.setVisibility(View.VISIBLE);
        if (this.progresso.equals(10)){
            progressBarC.setVisibility(View.GONE);
        }


    }

}