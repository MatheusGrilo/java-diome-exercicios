package exercicios.e1Fundamentos;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da base do retângulo: ");
        float base = sc.nextFloat();
        System.out.println("Digite o tamanho da altura do retângulo: ");
        float altura = sc.nextFloat();

        float area = base*altura;
        System.out.println("A área do retângulo é de: " + area);

        sc.close();
    }
}
