package com.company;

import java.awt.Image;

import javax.swing.text.html.ImageView;

public class Produto {

    private int    idProduto;
    private String descricaoProduto;
    private double preco;
    private int    quantidade;
    private String UM;
    private String observacoes;
    private int    idCategoria;

    public Produto(int pIdProduto, String pDescricaoProduto, double pPreco, int pQuantidade, String pUM,
                   String pObservacoes, int pIdCategoria) {
        idProduto = pIdProduto;
        descricaoProduto = pDescricaoProduto;
        preco = pPreco;
        quantidade = pQuantidade;
        UM = pUM;
        observacoes = pObservacoes;
        idCategoria = pIdCategoria;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getUM() {
        return UM;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdProduto(final int pIdProduto) {
        idProduto = pIdProduto;
    }

    public void setDescricaoProduto(final String pDescricaoProduto) {
        descricaoProduto = pDescricaoProduto;
    }

    public void setQuantidade(final int pQuantidade) {
        quantidade = pQuantidade;
    }

    public void setObservacoes(final String pObservacoes) {
        observacoes = pObservacoes;
    }

    public void setPreco(final double pPreco) {
        preco = pPreco;
    }

    public void setUM(final String pUM) {
        UM = pUM;
    }

    public void setIdCategoria(final int pIdCategoria) {
        idCategoria = pIdCategoria;
    }
}
