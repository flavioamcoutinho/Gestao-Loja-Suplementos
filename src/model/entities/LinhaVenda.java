package model.entities;

public class LinhaVenda {

    private int idLinhaVenda;
    private int idVenda;
    private int idProduto;
    private int quantidadeVenda;
    private double precoVenda;

    public LinhaVenda (int pIdLinhaVenda, int pIdVenda, int pIdProduto, int pQuantidadeVenda, double pPrecoVenda) {
        idLinhaVenda = pIdLinhaVenda;
        idVenda = pIdVenda;
        idProduto = pIdProduto;
        quantidadeVenda = pQuantidadeVenda;
        precoVenda = pPrecoVenda;
    }

    public int getIdLinhaVenda() {
        return idLinhaVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public int getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setIdLinhaVenda(final int pIdLinhaVenda) {
        idLinhaVenda = pIdLinhaVenda;
    }

    public void setIdVenda(final int pIdVenda) {
        idVenda = pIdVenda;
    }

    public void setIdProduto(final int pIdProduto) {
        idProduto = pIdProduto;
    }

    public void setQuantidadeVenda(final int pQuantidadeVenda) {
        quantidadeVenda = pQuantidadeVenda;
    }

    public void setPrecoVenda(final double pPrecoVenda) {
        precoVenda = pPrecoVenda;
    }
}

