package br.senai.sp.jandira.controller;

import java.util.Scanner;

public class Menu {

    public void executarMenu(){
        boolean continuar = true;

        Scanner scanner = new Scanner(System.in);

        while (continuar){
            System.out.println("|         Bem Vindo         |");
            System.out.println("|...........................|");
            System.out.println("|            Menu           |");
            System.out.println("|___________________________|");
            System.out.println("| 1- Cadastrar Cliente      |");
            System.out.println("| 2- Listar Clientes        |");
            System.out.println("| 3- Cadastrar Produto      |");
            System.out.println("| 4- Deletar Produto        |");
            System.out.println("| 5- Lista de Produtos      |");
            System.out.println("| 6- Realizar Venda         |");
            System.out.println("| 7- Histórico de Compras   |");
            System.out.println("| 8- Sair                   |");
            System.out.println("|...........................|");
            System.out.println("| Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("|    Cadastro de Clientes    |");
                    break;

                case 2:
                    System.out.println("|    Lista de Clientes    |");
                    break;

                case 3:
                    System.out.println("|    Cadastro de Produtos    |");
                    break;

                case 4:
                    System.out.println("|      Deletar Produtos      |");
                    break;

                case 5:
                    System.out.println("|     Lista de Produtos    |");
                    break;

                case 6:
                    System.out.println("|      Realizar Venda     |");
                    break;

                case 7:
                    System.out.println("|   Histórico de Compras    |");
                    break;

                case 8:
                    continuar = false;
                    break;
            }
        }
    }

}
