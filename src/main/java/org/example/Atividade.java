package org.example;
import java.util.Scanner;


public class Atividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do titular");
        String nome = sc.nextLine();
        double saldo = 0.0;
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("Menu Bancario");
            System.out.println("1. Ver saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");

            System.out.println("Digite a opcao desejada");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.printf("Saldo de %.2f \n", saldo);
            } else if (opcao == 2) {
                System.out.println("digite o valor que deseja depositar: ");
                double valor = sc.nextDouble();
                if (valor <= 0) {
                    System.out.println(valor);
                } else {
                    saldo += valor;
                }
            } else if (opcao == 3) {
                System.out.println("Qual o valor que deseja sacar: ");
                double sacar = sc.nextDouble();
                if (sacar <= saldo && sacar > 0) {
                    saldo -= sacar;
                } else {
                    System.out.println("Valor indisponivel para saque");
                }
            } else if (opcao == 4) {
                System.out.println("Saindo");
                break;
            } else {
                System.out.println("Opcao invalida");

            }

        }
    }
}


