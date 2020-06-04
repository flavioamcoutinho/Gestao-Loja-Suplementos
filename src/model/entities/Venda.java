package model.entities;

public class Venda {

    private int    idVenda;
    private double precoTotal;
    private String dataFatura;
    private int    idCliente;
    private int    idFuncionario;

    public Venda(int pIdVenda, double pPrecoTotal, String pDataFatura, int pIdCliente, int pIdFuncionario) {
        idVenda = pIdVenda;
        precoTotal = pPrecoTotal;
        dataFatura = pDataFatura;
        idCliente = pIdCliente;
        idFuncionario = pIdFuncionario;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public String getDataFatura() {
        return dataFatura;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdVenda(final int pIdVenda) {
        idVenda = pIdVenda;
    }

    public void setPrecoTotal(final double pPrecoTotal) {
        precoTotal = pPrecoTotal;
    }

    public void setDataFatura(final String pDataFatura) {
        dataFatura = pDataFatura;
    }

    public void setIdCliente(final int pIdCliente) {
        idCliente = pIdCliente;
    }

    public void setIdFuncionario(final int pIdFuncionario) {
        idFuncionario = pIdFuncionario;
    }
}
