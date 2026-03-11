package org.example;
import java.util.Scanner;
public class mercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeDoCliente;
        double totalCompra = 0.0;
        int opcao = 0;
        int totalItens = 0;
        int contadorproduto = 0;

        System.out.println("Digite o nome do cliente");
        nomeDoCliente = sc.nextLine();

        System.out.println("\n Bem-vindo ao Mercado VILA VELHA, " + nomeDoCliente + " ");

        while (opcao != 6) {
            System.out.println("\n--- MENU DO MERCADO ---");
            System.out.println("1 - Arroz  - R$ 25,00");
            System.out.println("2 - Feijão - R$ 10,00");
            System.out.println("3 - Leite  - R$ 8,00");
            System.out.println("4 - Carne  - R$ 40,00");
            System.out.println("5 - Ver total da compra");
            System.out.println("6 - Finalizar compra");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            if (opcao == 1) {
                totalCompra += 25.00;
                totalItens++;
                System.out.println("Arroz adicionado");
            } else if (opcao == 2) {
                totalCompra += 10.00;
                totalItens++;
                System.out.println("Feijão adicionado!");
            } else if (opcao == 3) {
                totalCompra += 8.00;
                totalItens++;
                System.out.println("Leite adicionado");
            } else if (opcao == 4) {
                totalCompra += 40.00;
                totalItens++;
                System.out.println("Carne adicionada");
            } else if (opcao == 5) {
                System.out.printf("Total parcial: R$ %.2f\n", totalCompra);
            } else if (opcao == 6) {
                System.out.println("Finalizando...");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
            double desconto = 0.0;
            if (totalCompra > 100.00) {
                desconto = totalCompra * 0.10;
            }

            double valorFinal = totalCompra - desconto;

            System.out.println("Cliente: " + nomeDoCliente);
            System.out.println("Itens comprados: " + totalItens);
            System.out.printf("Valor da compra: R$ %.2f\n", totalCompra);
            System.out.printf("Desconto aplicado: R$ %.2f\n", desconto);
            System.out.printf("Valor final: R$ %.2f\n", valorFinal);

            double descontopix = 0.0;

            System.out.println("Selecione la forma payament: ");
            System.out.println("1 - Dinheiro ");
            System.out.println("2 - PIQUES (5% de desconto adicional )");
            System.out.println("3 - Cartão");

            int formaPagamento = 0;
            while (formaPagamento < 1 && formaPagamento > 3) {
                System.out.println("Forma de pagamento inválida! Tente novamente!");
            }

            formaPagamento = sc.nextInt();

            if (formaPagamento == 2) {
                descontopix = valorFinal * 0.05;
                totalCompra -= descontopix;
                System.out.println("Desconto PIX aplicado!");
            } else if (formaPagamento < 1 || formaPagamento > 3) {
                System.out.println("Opção de pagamento inválida! Tente novamente.");
            }

            System.out.println("\nRESUMO DA COMPRA");
            System.out.println("Cliente: " + nomeDoCliente);
            System.out.println("Total de produtos comprados: " + contadorproduto);
            System.out.printf("Valor da compra original: R$ %.2f \n", totalCompra);
            System.out.printf("Desconto por valor (>R$100): R$ %.2f\n", desconto);
            System.out.printf("Desconto PIX: R$ %.2f\n", descontopix);
            System.out.printf("Valor final a pagar: R$ %.2f\n", valorFinal);

        }

    }


}

