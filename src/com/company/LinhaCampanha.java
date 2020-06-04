package com.company;

public class LinhaCampanha {

    private int idLinhaCampanha;
    private int idCampanha;
    private int idProduto;
    private int desconto;

    public LinhaCampanha (int pIdLinhaCampanha, int pIdCampanha, int pIdProduto, int pDesconto) {
        idLinhaCampanha  =pIdLinhaCampanha;
        idCampanha = pIdCampanha;
        idProduto = pIdProduto;
        desconto = pDesconto;
    }

    public int getIdLinhaCampanha() {
        return idLinhaCampanha;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public int getIdCampanha() {
        return idCampanha;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setIdLinhaCampanha(final int pIdLinhaCampanha) {
        idLinhaCampanha = pIdLinhaCampanha;
    }

    public void setIdCampanha(final int pIdCampanha) {
        idCampanha = pIdCampanha;
    }

    public void setIdProduto(final int pIdProduto) {
        idProduto = pIdProduto;
    }

    public void setDesconto(final int pDesconto) {
        desconto = pDesconto;
    }
}
