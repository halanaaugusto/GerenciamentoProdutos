package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Produto {

    private int idProduto, estoque;
    private String nome, fornecedor;
    private double preco;
    Scanner scanner = new Scanner(System.in);

    public void cadastrarProduto(){
        System.out.println("|        Cadastro de Produtos       |");
        System.out.println("|...................................|");
        System.out.println("| Informe o id do produto: ");
        this.idProduto = scanner.nextInt();
        System.out.println("| Informe o nome do produto: ");
        this.nome = scanner.nextLine();
        System.out.println("| Informe a quantidade para estoque: ");
        this.estoque = scanner.nextInt();
        System.out.println("| Informe o preço: ");
        this.preco = scanner.nextDouble();
        System.out.println("| Informe o fornecedor: ");
        this.fornecedor = scanner.nextLine();
        scanner.nextLine();

        System.out.println("| Cadastro efetuado com sucesso!!! |");
        System.out.println("|..................................|");
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
