package exercicios.e2Estruturas;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("======== Tábuada do número " + numero + " =======");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
        System.out.println("======== Fim do programa =======");

        sc.close();

    }
}
