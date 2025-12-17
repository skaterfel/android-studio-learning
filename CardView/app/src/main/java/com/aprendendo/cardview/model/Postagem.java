package com.aprendendo.cardview.model;

import android.widget.ImageView;

public class Postagem {
    private String username;
    private String dataPostagem;
    private int imagemPostagem;
    private String postagem;

    public Postagem(){

    }

    public Postagem(String username, String dataPostagem, int imagemPostagem, String postagem) {
        this.username = username;
        this.dataPostagem = dataPostagem;
        this.imagemPostagem = imagemPostagem;
        this.postagem = postagem;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(String dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

    public int getImagemPostagem() {
        return imagemPostagem;
    }

    public void setImagemPostagem(int imagemPostagem) {
        this.imagemPostagem = imagemPostagem;
    }

    public String getPostagem() {
        return postagem;
    }

    public void setPostagem(String postagem) {
        this.postagem = postagem;
    }
}


