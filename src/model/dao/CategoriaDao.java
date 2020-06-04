package model.dao;

import java.util.List;

import model.entities.Categoria;

public interface CategoriaDao {

    void insert(Categoria pCategoria);

    void update(Categoria pCategoria);

    void deleteById(int idCategoria);

    Categoria findById(int idCategoria);

    List<Categoria> findAll();

}
