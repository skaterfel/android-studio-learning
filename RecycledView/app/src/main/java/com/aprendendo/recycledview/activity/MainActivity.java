package com.aprendendo.recycledview.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aprendendo.recycledview.R;
import com.aprendendo.recycledview.RecyclerItemClickListener;
import com.aprendendo.recycledview.adapter.Adapter;
import com.aprendendo.recycledview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

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

        recyclerView = findViewById(R.id.recyclerView);


        //Listagem de filmes
        this.criarFilmes();
//        Configurar Adapter
        Adapter adapter = new Adapter( listaFilmes);


//        Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
                getApplicationContext()
        );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        //Add evento de click
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                               Filme filme = listaFilmes.get(position);
                                Toast.makeText(getApplicationContext(), "Item pressionado: " + filme.getTitulo(), Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Filme filme = listaFilmes.get(position);
                                Toast.makeText(getApplicationContext(), "Clique longo " + filme.getTitulo(), Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                )

        );



    }

    public void criarFilmes(){
        Filme filme = new Filme("Constantine","Terror/Ação","2005");
        this.listaFilmes.add(filme);

        filme = new Filme("American Pie", "Comédia/Romance","1999");
        this.listaFilmes.add(filme);

        filme = new Filme("Blade: O Caçador de Vampiros", "Terror/Ação","1998");
        this.listaFilmes.add(filme);

        filme = new Filme("Van Helsing: O Caçador de Monstros", "Terror/Ação","2004");
        this.listaFilmes.add(filme);

        filme = new Filme("The Last Naruto: O Filme", "Ação/Romance","2014");
        this.listaFilmes.add(filme);

        filme = new Filme("Piratas do Vale do Silício","Drama","1999");
        this.listaFilmes.add(filme);

        filme = new Filme("Fome de Poder","Documentario/Drama","2016");
        this.listaFilmes.add(filme);

        filme = new Filme("Eu sou a Lenda","Ação/Ficção","2007");
        this.listaFilmes.add(filme);

        filme = new Filme("O Jogo da Imitação","Drama/Suspense","2014");
        this.listaFilmes.add(filme);

        filme = new Filme("Truque de Mestre","Thriller/Crime","2013");
        this.listaFilmes.add(filme);

        filme = new Filme("Meu Amigo Totoro","Fantasia/Aventura","1988");
        this.listaFilmes.add(filme);

        filme = new Filme("Vingadores: Ultimato","Ação/Ficção ","2019");
        this.listaFilmes.add(filme);


    }

}