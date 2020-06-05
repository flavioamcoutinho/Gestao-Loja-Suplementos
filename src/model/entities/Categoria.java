package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Categoria
        implements Serializable {

    private Integer idCategoria;
    private String  descricaoCategoria;

    public Categoria() {

    }

    public Categoria(Integer pIdCategoria, String pDescricaoCategoria) {
        this.idCategoria = pIdCategoria;
        this.descricaoCategoria = pDescricaoCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public String getDescricaoCategoria() {
        return descricaoCategoria;
    }

    public void setIdCategoria(final Integer pIdCategoria) {
        this.idCategoria = pIdCategoria;
    }

    public void setDescricaoCategoria(final String pDescricaoCategoria) {
        this.descricaoCategoria = pDescricaoCategoria;
    }

    @Override
    public boolean equals(final Object pO) {
        if (this == pO) {
            return true;
        }
        if (pO == null || getClass() != pO.getClass()) {
            return false;
        }
        final Categoria categoria = (Categoria) pO;
        return idCategoria == categoria.idCategoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCategoria);
    }

    @Override
    public String toString() {
        return "Categoria{" + "idCategoria=" + idCategoria + ", descricaoCategoria='" + descricaoCategoria + '\'' + '}';
    }

}
