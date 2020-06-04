package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DBIntegrityException;
import db.DbException;
import model.entities.Categoria;
import model.entities.Produto;

public class Main {

    public static void main(String[] args) {

        Categoria obj = new Categoria(1, "Vestuario");

        Produto produto = new Produto(1, "Proteina", 12.3, 10, "UM", "shsa", obj);

        System.out.println(produto);

    }
}

//TODO Recuperar dados

//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//
//        try {
//            conn = DB.getConn();
//
//            st = conn.createStatement();
//
//            rs = st.executeQuery("select * from categoria");
//
//            while (rs.next()) {
//                System.out.println(rs.getInt("idCategoria") + " - " + rs.getString("descricaoCategoria"));
//            }
//        }
//        catch (SQLException e) {
//            e.printStackTrace();
//        }
//        finally {
//            DB.closeResultSet(rs);
//            DB.closeStatement(st);
//            DB.closeConn();
//        }

//TODO Inserir Dados

//        Connection conn = null;
//        PreparedStatement st = null;
//
//        try {
//            conn = DB.getConn();
//
//            st = conn.prepareStatement(
//                    "insert into produto (descricaoProduto, preco, quantidade, UM, observacoes, idCategoria) values (?,?,?,?,?,?)",
//                    Statement.RETURN_GENERATED_KEYS);
//
//            st.setString(1, "Tshirt");
//            st.setDouble(2, 14.9);
//            st.setInt(3, 15);
//            st.setString(4, "UNI");
//            st.setString(5, "Lavar a seco");
//            st.setInt(6, 2);
//
//            int rowsAffected = st.executeUpdate();
//
//            if(rowsAffected > 0) {
//                ResultSet rs =  st.getGeneratedKeys();
//                while (rs.next()) {
//                    int id = rs.getInt(1);
//                    System.out.println("Done! Id = " +id);
//                }
//            }else {
//                System.out.println("No Rows Affected!!");
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            DB.closeStatement(st);
//            DB.closeConn();
//        }

//TODO Atualizar Dados

//        Connection conn = null;
//        PreparedStatement st = null;
//
//        try {
//            conn = DB.getConn();
//
//            st = conn.prepareStatement(
//                    "update produto set preco = preco + ? where (idCategoria = ?)"
//            );
//
//            st.setDouble(1, 4.5);
//            st.setInt(2,2);
//
//            int RowsAffected = st.executeUpdate();
//
//            System.out.println("Done! Rows Affected: " + RowsAffected);
//        }
//        catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        finally {
//            DB.closeStatement(st);
//            DB.closeConn();
//        }

//TODO Apagar dados

//        Connection conn = null;
//        PreparedStatement st = null;
//
//        try {
//            conn = DB.getConn();
//            st = conn.prepareStatement(
//                "delete from categoria where idCategoria = ?"
//            );
//
//            st.setInt(1, 2);
//
//            int rowsAffected = st.executeUpdate();
//
//            System.out.println("Done! Rows Affected: " + rowsAffected);
//        }
//        catch (SQLException e) {
//            throw new DBIntegrityException(e.getMessage());
//        }
//        finally {
//            DB.closeStatement(st);
//            DB.closeConn();
//        }

//TODO Transacoes

//        Connection conn = null;
//        Statement st = null;
//
//        try {
//            conn = DB.getConn();
//
//            conn.setAutoCommit(false);
//
//            st = conn.createStatement();
//
//            int rows1 = st.executeUpdate("update produto set preco = 14.9 where idCategoria = 1");
//
////            int x = 1;
////
////            if(x < 2) {
////                throw new SQLException("Fake error");
////            }
//
//            int rows2 = st.executeUpdate("update produto set preco = 29.9 where idCategoria = 2");
//
//            conn.commit();
//
//            System.out.println("rows1 " + rows1);
//            System.out.println("rows2 " + rows2);
//        }
//        catch (SQLException e){
//            try {
//                conn.rollback();
//                throw new DbException("Transaction rolled back! Caused by " + e.getMessage());
//            }
//            catch (SQLException e1){
//                throw new DbException("Error trying to roll back! Caused by " + e1.getMessage());
//            }
//
//        }
//        finally {
//            DB.closeStatement(st);
//            DB.closeConn();
//        }

