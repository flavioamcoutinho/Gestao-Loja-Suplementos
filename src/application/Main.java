package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import db.DB;
import db.DBIntegrityException;
import db.DbException;
import model.dao.CategoriaDao;
import model.dao.DaoFactory;
import model.dao.ProdutoDao;
import model.dao.impl.ProdutoDaoJDBC;
import model.entities.Categoria;
import model.entities.Produto;

public class Main {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        ProdutoDao produtoDao = DaoFactory.createProdutoDao();
//
//        System.out.println(" === TEST 1 : Produto findById === ");
//
//        Produto produto = produtoDao.findById(1);
//
//        System.out.println(produto);
//
//        System.out.println("/n === TEST 2 : Produto findBycategoria === ");
//
//        Categoria categoria = new Categoria(2, null);
//
//        List<Produto> list = produtoDao.findByCategoria(categoria);
//
//        for (Produto obj : list) {
//            System.out.println(obj);
//        }
//
//        System.out.println("/n === TEST 3 : Produto findAll === ");
//
//        list = produtoDao.findAll();
//
//        for (Produto obj : list) {
//            System.out.println(obj);
//        }
//
//        System.out.println("/n === TEST 4 : Produto insert === ");
//
//        Produto newProduto = new Produto(null,"Aveia",10.99,30,"UNI","",categoria);
//        produtoDao.insert(newProduto);
//        System.out.println("Inserted! New id = " + newProduto.getIdProduto());
//
//        System.out.println("/n === TEST 5 : Produto update === ");
//
//        produto = produtoDao.findById(1);
//        produto.setDescricaoProduto("Protein");
//        produtoDao.update(produto);
//        System.out.println("Update Completed!");
//
//        System.out.println("/n === TEST 6 : Produto delete === ");
//
//        System.out.println("Enter id for delete test: ");
//        int id = scanner.nextInt();
//        produtoDao.deleteById(id);
//        System.out.println("Delete completed!");
//
//        scanner.close();

        Scanner sc = new Scanner(System.in);

        CategoriaDao departmentDao = DaoFactory.createCategoriaDao();

        System.out.println("=== TEST 1: findById =======");
        Categoria dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("\n=== TEST 2: findAll =======");
        List<Categoria> list = departmentDao.findAll();
        for (Categoria d : list) {
            System.out.println(d);
        }

        System.out.println("\n=== TEST 3: insert =======");
        Categoria newDepartment = new Categoria(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id: " + newDepartment.getIdCategoria());

        System.out.println("\n=== TEST 4: update =======");
        Categoria dep2 = departmentDao.findById(1);
        dep2.setDescricaoCategoria("Food");
        departmentDao.update(dep2);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 5: delete =======");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();


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