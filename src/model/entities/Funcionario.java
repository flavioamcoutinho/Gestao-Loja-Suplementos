package model.entities;

public class Funcionario {

    private int     idFuncionario;
    private String  nomeFuncionario;
    private int     telefone;
    private String  morada;
    private String  username;
    private String  password;
    private boolean gerente;

    public Funcionario(int pIdFuncionario, String pNomeFuncionario, int pTelefone, String pMorada, String pUsername, String pPassword, boolean pGerente) {
        idFuncionario = pIdFuncionario;
        nomeFuncionario = pNomeFuncionario;
        telefone = pTelefone;
        morada = pMorada;
        username = pUsername;
        password = pPassword;
        gerente = pGerente;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getMorada() {
        return morada;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isGerente() {
        return gerente;
    }

    public void setIdFuncionario(final int pIdFuncionario) {
        idFuncionario = pIdFuncionario;
    }

    public void setNomeFuncionario(final String pNomeFuncionario) {
        nomeFuncionario = pNomeFuncionario;
    }

    public void setTelefone(final int pTelefone) {
        telefone = pTelefone;
    }

    public void setMorada(final String pMorada) {
        morada = pMorada;
    }

    public void setUsername(final String pUsername) {
        username = pUsername;
    }

    public void setPassword(final String pPassword) {
        password = pPassword;
    }

    public void setGerente(final boolean pGerente) {
        gerente = pGerente;
    }
}
