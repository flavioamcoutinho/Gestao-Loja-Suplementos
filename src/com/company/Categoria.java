package com.company;

public class Categoria {

    private int idCategoria;
    private String descricaoCategoria;

    public  Categoria (int pIdCategoria, String pDescricaoCategoria) {
        idCategoria = pIdCategoria;
        descricaoCategoria = pDescricaoCategoria;
    }

    public int getIdCategoria() { return idCategoria; }

    public String getDescricaoCategoria() { return descricaoCategoria; }

    public void setIdCategoria(final int pIdCategoria) { idCategoria = pIdCategoria; }

    public void setDescricaoCategoria(final String pDescricaoCategoria) { descricaoCategoria = pDescricaoCategoria; }
}
