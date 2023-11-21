package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Cliente {

    private int idCliente, telefone;
    private String cpf, nome;

    Scanner scanner = new Scanner(System.in);

    public void cadastrarCliente(){
        System.out.println("|           Cadastro de Clientes           |");
        System.out.println("|.............................................|");
        System.out.println("| Informe um id para o cliente: ");
        this.idCliente = scanner.nextInt();
        System.out.println("| Informe o nome: ");
        this.nome = scanner.nextLine();
        System.out.println("| Informe o cpf: ");
        this.cpf = scanner.nextLine();
        System.out.println("| Informe o telefone: ");
        this.telefone = scanner.nextInt();
        scanner.nextLine();

        System.out.println("| Cadastro efetuado com sucesso!!! |");
        System.out.println("|..................................|");
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
