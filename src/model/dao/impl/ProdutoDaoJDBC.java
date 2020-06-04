package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.ProdutoDao;
import model.entities.Categoria;
import model.entities.Produto;

public class ProdutoDaoJDBC
        implements ProdutoDao {

    private Connection conn;

    public ProdutoDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(final Produto pProduto) {

    }

    @Override
    public void update(final Produto pProduto) {

    }

    @Override
    public void deleteById(final int idProduto) {

    }

    @Override
    public Produto findById(final int idProduto) {

        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            statement = conn.prepareStatement("select produto.*, categoria.descricaoCategoria " +
                                              "from produto inner join categoria " +
                                              "on produto.idCategoria = categoria.idCategoria " +
                                              "where produto.idProduto = ?");

            statement.setInt(1, idProduto);

            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                Categoria categoria = new Categoria();
                categoria.setIdCategoria(resultSet.getInt("idCategoria"));
                categoria.setDescricaoCategoria(resultSet.getString("descricaoCategoria"));

                Produto produto = new Produto();
                produto.setIdProduto(resultSet.getInt("idProduto"));
                produto.setDescricaoProduto(resultSet.getString("descricaoProduto"));
                produto.setPreco(resultSet.getDouble("preco"));
                produto.setQuantidade(resultSet.getInt("quantidade"));
                produto.setUM(resultSet.getString("UM"));
                produto.setObservacoes(resultSet.getString("observacoes"));
                produto.setIdCategoria(categoria); //foreign key

                return produto;
            }
            return null;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(statement);
            DB.closeResultSet(resultSet);
        }

    }

    @Override
    public List<Produto> findAll() {
        return null;
    }
}
