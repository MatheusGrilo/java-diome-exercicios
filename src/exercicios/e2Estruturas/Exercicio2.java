package exercicios.e2Estruturas;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite seu altura: ");
        double altura = sc.nextDouble();
        sc.nextLine();

        double imc = peso / (altura * altura);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Peso ideal.");
        } else if (imc < 30) {
            System.out.println("Levemente acima do peso.");
        } else if (imc < 35) {
            System.out.println("Obesidade Grau I");
        } else if (imc < 40) {
            System.out.println("Obesidade Grau II");
        } else {
            System.out.println("Obesidade Grau III");
        }

        sc.close();

    }
}
