package com.company;

public class Cliente {

    private int     idCliente;
    private String  nomeCliente;
    private int     telefone;
    private String  morada;
    private int     NIF;
    private boolean premium;

    public Cliente(int pIdCliente, String pNomeCliente, int pTelefone, String pMorada, int pNIF, int pPontos,
                   boolean pPremium) {
        idCliente = pIdCliente;
        nomeCliente = pNomeCliente;
        telefone = pTelefone;
        morada = pMorada;
        NIF = pNIF;
        premium = pPremium;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getMorada() {
        return morada;
    }

    public int getNIF() {
        return NIF;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setIdCliente(final int pIdCliente) {
        idCliente = pIdCliente;
    }

    public void setNomeCliente(final String pNomeCliente) {
        nomeCliente = pNomeCliente;
    }

    public void setTelefone(final int pTelefone) {
        telefone = pTelefone;
    }

    public void setMorada(final String pMorada) {
        morada = pMorada;
    }

    public void setNIF(final int pNIF) {
        NIF = pNIF;
    }

    public void setPremium(final boolean pPremium) {
        premium = pPremium;
    }
}
