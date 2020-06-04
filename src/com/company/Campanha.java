package com.company;

public class Campanha {

    private int idCampanha;
    private String descricaoCampanha;
    private String dataInicio;
    private String dataFim;

    public Campanha (int pIdCampanha, String pDescricaoCampanha, String pDataInicio, String pDataFim) {
        idCampanha = pIdCampanha;
        descricaoCampanha = pDescricaoCampanha;
        dataInicio = pDataInicio;
        dataFim = pDataFim;
    }

    public int getIdCampanha() {
        return idCampanha;
    }

    public String getDescricaoCampanha() {
        return descricaoCampanha;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setIdCampanha(final int pIdCampanha) {
        idCampanha = pIdCampanha;
    }

    public void setDescricaoCampanha(final String pDescricaoCampanha) {
        descricaoCampanha = pDescricaoCampanha;
    }

    public void setDataInicio(final String pDataInicio) {
        dataInicio = pDataInicio;
    }

    public void setDataFim(final String pDataFim) {
        dataFim = pDataFim;
    }
}
