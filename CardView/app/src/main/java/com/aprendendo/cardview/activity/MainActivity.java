package com.aprendendo.cardview.activity;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aprendendo.cardview.R;
import com.aprendendo.cardview.adapter.Adapter;
import com.aprendendo.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> listaPostagens = new ArrayList<>();


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

         recyclerPostagem = findViewById(R.id.recyclerPostagem);

         //criando as postagens
        this.criarPostages();
         // config adapter
        Adapter adapter = new Adapter(listaPostagens);

         //define layout
        //LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        //layoutManager.setOrientation(RecyclerView.HORIZONTAL);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 1);
        recyclerPostagem.setLayoutManager(layoutManager);
        recyclerPostagem.setHasFixedSize(true);
        recyclerPostagem.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));

        //define adapter
        recyclerPostagem.setAdapter(adapter);

    }

    private void criarPostages() {
        Postagem postagem = new Postagem("Felipe","Agora mesmo",R.drawable.imagem3,"Treinando Android usando java.");
        listaPostagens.add(postagem);
        postagem = new Postagem("Iori", "2 dias atras", R.drawable.imagem4, "treinando e agora colocando o .add(postagem) kkkk");
        listaPostagens.add(postagem);
        postagem = new Postagem("Felipe Melo","Hoje" ,R.drawable.imagem3 , "Iori Bueno de Melo");
        listaPostagens.add(postagem);
        postagem = new Postagem("Iori Melo", "Hoje", R.drawable.imagem2, "Todos dias, sinto falta de você meu lindo! Te Amo Iori.");
        listaPostagens.add(postagem);

    }
}