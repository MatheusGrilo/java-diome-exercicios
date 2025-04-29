package exercicios.e1Fundamentos;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho de um lado do quadrado: ");
        float lado = sc.nextFloat();

        float area = lado * lado;
        System.out.println("A área do quadrado é " + area);

        sc.close();
    }
}
