package org.example;
import java.util.Scanner;

public class Atividades {

    public static void main(String[] args) {

//        int a = 5;
//        int b = 9;
//
//       int soma = a + b;
//       int soma2 = a / b;
//       int soma3 = a * b;
//       int soma4 = a - b;
//
//
//
//        System.out.println(soma);
//        System.out.println(soma2);
//        System.out.println(soma3);
//        System.out.println(soma4);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
                int idade = sc.nextInt();

        if(idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");

        }



    }
}
