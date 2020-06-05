package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DBIntegrityException;
import db.DbException;
import model.dao.CategoriaDao;
import model.entities.Categoria;

public class CategoriaDaoJDBC implements CategoriaDao {

    private Connection conn;

    public CategoriaDaoJDBC(Connection pConn) {
        this.conn = pConn;
    }

    @Override
    public void insert(final Categoria pCategoria) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "INSERT INTO categoria " +
                    "(descricaoCategoria) " +
                    "VALUES " +
                    "(?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, pCategoria.getDescricaoCategoria());

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    pCategoria.setIdCategoria(id);
                }
            }
            else {
                throw new DbException("Unexpected error! No rows affected!");
            }
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void update(final Categoria pCategoria) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "UPDATE categoria " +
                    "SET descricaoCategoria = ? " +
                    "WHERE idCategoria = ?");

            st.setString(1, pCategoria.getDescricaoCategoria());
            st.setInt(2, pCategoria.getIdCategoria());

            st.executeUpdate();
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void deleteById(final int idCategoria) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "DELETE FROM categoria WHERE idCategoria = ?");

            st.setInt(1, idCategoria);

            st.executeUpdate();
        }
        catch (SQLException e) {
            throw new DBIntegrityException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public Categoria findById(final int idCategoria) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT * FROM categoria WHERE idCategoria = ?");
            st.setInt(1, idCategoria);
            rs = st.executeQuery();
            if (rs.next()) {
                Categoria obj = new Categoria();
                obj.setIdCategoria(rs.getInt("idCategoria"));
                obj.setDescricaoCategoria(rs.getString("descricaoCategoria"));
                return obj;
            }
            return null;
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Categoria> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT * FROM categoria ORDER BY descricaoCategoria");
            rs = st.executeQuery();

            List<Categoria> list = new ArrayList<>();

            while (rs.next()) {
                Categoria obj = new Categoria();
                obj.setIdCategoria(rs.getInt("idCategoria"));
                obj.setDescricaoCategoria(rs.getString("descricaoCategoria"));
                list.add(obj);
            }
            return list;
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

}
