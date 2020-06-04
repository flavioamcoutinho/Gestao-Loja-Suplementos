package com.company;

public class LoteProduto {

    private int    idLoteProduto;
    private String dataValidade;
    private int    quantidadeLote;
    private int    idProduto;

    public LoteProduto(int pIdLoteProduto, String pDataValidade, int pQuantidadeLote, int pIdProduto) {
        idLoteProduto = pIdLoteProduto;
        dataValidade = pDataValidade;
        quantidadeLote = pQuantidadeLote;
        idProduto = pIdProduto;
    }

    public int getIdLoteProduto() {
        return idLoteProduto;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public int getQuantidadeLote() {
        return quantidadeLote;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdLoteProduto(final int pIdLoteProduto) {
        idLoteProduto = pIdLoteProduto;
    }

    public void setDataValidade(final String pDataValidade) {
        dataValidade = pDataValidade;
    }

    public void setQuantidadeLote(final int pQuantidadeLote) {
        quantidadeLote = pQuantidadeLote;
    }

    public void setIdProduto(final int pIdProduto) {
        idProduto = pIdProduto;
    }
}