package model.entities;

import java.awt.Image;
import java.io.Serializable;
import java.util.Objects;

import javax.swing.text.html.ImageView;

public class Produto
        implements Serializable {

    private int    idProduto;
    private String descricaoProduto;
    private double preco;
    private int    quantidade;
    private String UM;
    private String observacoes;

    private Categoria idCategoria;

    public Produto() {

    }

    public Produto(int pIdProduto, String pDescricaoProduto, double pPreco, int pQuantidade, String pUM,
                   String pObservacoes, Categoria pIdCategoria) {
        this.idProduto = pIdProduto;
        this.descricaoProduto = pDescricaoProduto;
        this.preco = pPreco;
        this.quantidade = pQuantidade;
        this.UM = pUM;
        this.observacoes = pObservacoes;
        this.idCategoria = pIdCategoria;
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

    public Categoria getIdCategoria() {
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

    public void setIdCategoria(Categoria pIdCategoria) {
        idCategoria = pIdCategoria;
    }

    @Override
    public boolean equals(final Object pO) {
        if (this == pO) {
            return true;
        }
        if (pO == null || getClass() != pO.getClass()) {
            return false;
        }
        final Produto produto = (Produto) pO;
        return idProduto == produto.idProduto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduto);
    }

    @Override
    public String toString() {
        return "Produto{" + "idProduto=" + idProduto + ", descricaoProduto='" + descricaoProduto + '\'' + ", preco=" +
               preco + ", quantidade=" + quantidade + ", UM='" + UM + '\'' + ", observacoes='" + observacoes + '\'' +
               ", idCategoria=" + idCategoria + '}';
    }

}
