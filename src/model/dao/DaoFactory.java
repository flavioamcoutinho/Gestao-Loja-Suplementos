package model.dao;

import db.DB;
import model.dao.impl.CategoriaDaoJDBC;
import model.dao.impl.ProdutoDaoJDBC;
import model.entities.Categoria;

public class DaoFactory {

    public static ProdutoDao createProdutoDao() {
        return new ProdutoDaoJDBC(DB.getConn());
    }

    public static CategoriaDao createCategoriaDao() { return new CategoriaDaoJDBC(DB.getConn()); }

}
