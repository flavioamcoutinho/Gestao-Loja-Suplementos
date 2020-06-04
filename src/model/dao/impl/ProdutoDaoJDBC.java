package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.DelayQueue;

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
            statement = conn.prepareStatement(
                    "select produto.*, categoria.descricaoCategoria " + "from produto inner join categoria " +
                    "on produto.idCategoria = categoria.idCategoria " + "where produto.idProduto = ?");

            statement.setInt(1, idProduto);

            resultSet = statement.executeQuery();

            if (resultSet.next()) {

                Categoria categoria = instantiateCategoria(resultSet);

                Produto produto = instantiateProduto(resultSet, categoria);

                return produto;
            }
            return null;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(statement);
            DB.closeResultSet(resultSet);
        }

    }

    private Produto instantiateProduto(final ResultSet pResultSet, Categoria pCategoria)
            throws SQLException {
        Produto pProduto = new Produto();
        pProduto.setIdProduto(pResultSet.getInt("idProduto"));
        pProduto.setDescricaoProduto(pResultSet.getString("descricaoProduto"));
        pProduto.setPreco(pResultSet.getDouble("preco"));
        pProduto.setQuantidade(pResultSet.getInt("quantidade"));
        pProduto.setUM(pResultSet.getString("UM"));
        pProduto.setObservacoes(pResultSet.getString("observacoes"));
        pProduto.setIdCategoria(pCategoria); //foreign key

        return pProduto;
    }

    private Categoria instantiateCategoria(final ResultSet pResultSet)
            throws SQLException {
        Categoria pCategoria = new Categoria();
        pCategoria.setIdCategoria(pResultSet.getInt("idCategoria"));
        pCategoria.setDescricaoCategoria(pResultSet.getString("descricaoCategoria"));

        return pCategoria;
    }

    @Override
    public List<Produto> findAll() {
        return null;
    }

    @Override
    public List<Produto> findByCategoria(final Categoria pCategoria) {
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            statement = conn.prepareStatement(
                    "select produto.*, categoria.descricaoCategoria from produto inner join categoria " +
                    "on produto.idCategoria = categoria.idCategoria where categoria.idCategoria = ? " +
                    "order by descricaoProduto");

            statement.setInt(1, pCategoria.getIdCategoria());

            resultSet = statement.executeQuery();

            List<Produto> list = new ArrayList<>();
            Map<Integer, Categoria> map = new HashMap<>();

            while (resultSet.next()) {

                Categoria categoria = map.get(resultSet.getInt("idCategoria"));

                if (categoria == null) {
                    categoria = instantiateCategoria(resultSet);
                    map.put(resultSet.getInt("idCategoria"), categoria);
                }

                Produto produto = instantiateProduto(resultSet, categoria);

                list.add(produto);
            }
            return list;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(statement);
            DB.closeResultSet(resultSet);
        }

    }
}
