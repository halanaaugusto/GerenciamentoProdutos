package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conexao;
import br.senai.sp.jandira.model.Produto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdutoController {

    Conexao conexao = new Conexao();

    Connection connection = conexao.getConnection();

    public void cadastrarProduto(Produto newProduto) throws SQLException {
        Statement statement = connection.createStatement();

        String queryCadastro = "INSERT INTO produtos (idProduto, nome, estoque, preco, fornecedor) values("
                + newProduto.getIdProduto() + ",'" + newProduto.getNome() + "','" + newProduto.getEstoque() + "','"
                + newProduto.getPreco() + "','" + newProduto.getFornecedor() + "')";

        statement.executeUpdate(queryCadastro);
        System.out.println("| Produto cadastrado com sucesso!!! |");
    }

    public void listarProdutos() throws SQLException {
        Statement statement = connection.createStatement();

        String queryConsulta = "SELECT * FROM produtos";

        ResultSet resultSet = statement.executeQuery(queryConsulta);

        Produto produto = new Produto();

        while (resultSet.next()){
            System.out.println("|...................................|");
            produto.setIdProduto(resultSet.getInt("idProduto"));
            produto.setNome(resultSet.getString("nome"));
            produto.setEstoque(resultSet.getInt("estoque"));
            produto.setPreco(resultSet.getInt("preco"));
            produto.setFornecedor(resultSet.getString("fornecedor"));

            System.out.println(produto.getIdProduto());
            System.out.println(produto.getNome());
            System.out.println(produto.getEstoque());
            System.out.println(produto.getPreco());
            System.out.println(produto.getFornecedor());
            System.out.println("|....................................|\n");
        }
    }
}
