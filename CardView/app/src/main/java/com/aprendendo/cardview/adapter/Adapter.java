package com.aprendendo.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aprendendo.cardview.R;
import com.aprendendo.cardview.model.Postagem;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder>{
    private List<Postagem> listaPostagens;

    public Adapter(List<Postagem> lista){
        this.listaPostagens = lista;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemPostagem = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_detalhe, parent, false);
        return new MyViewHolder(itemPostagem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Postagem postagem = listaPostagens.get(position);

        holder.username.setText(postagem.getUsername());
        holder.dataPostagem.setText(postagem.getDataPostagem());
        holder.imagemPostagem.setImageResource(postagem.getImagemPostagem());
        holder.postagem.setText(postagem.getPostagem());
    }

    @Override
    public int getItemCount() {
        return listaPostagens.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView username;
        TextView dataPostagem;
        ImageView imagemPostagem;
        TextView postagem;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            username = itemView.findViewById(R.id.textUser);
            dataPostagem = itemView.findViewById(R.id.textData);
            imagemPostagem = itemView.findViewById(R.id.imagePost);
            postagem = itemView.findViewById(R.id.textPostagem);

        }
    }
}
