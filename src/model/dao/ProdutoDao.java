package model.dao;

import java.util.List;

import model.entities.Produto;

public interface ProdutoDao {

    void insert(Produto pProduto);

    void update(Produto pProduto);

    void deleteById(int idProduto);

    Produto findById(int idProduto);

    List<Produto> findAll();

}
