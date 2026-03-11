package org.example;

import java.util.Scanner;

public class Revisao {
    public static void main(String[] args) {

        int idade = 18;
        if (idade >=18) {
            System.out.println("Maior de Idade");
        } else if (idade < 18 && idade > 11) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Menor de Idade");



        }

        for(int i = 0; i <10; i++){
            System.out.println(i);


        }

        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String none = sc.nextLine();
        System.out.println("Digite sua cidade de nascimento: ");
        String cidade = sc.nextLine();
    }
}
