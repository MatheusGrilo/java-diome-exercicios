package exercicios.e2Estruturas;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você digitará o primeiro número, os demais digitados serão divididos por ele.");
        System.out.println("Caso o resto da divisão não seja diferente que zero, continuará solicitando outros números.");
        System.out.println("OBS: Você não pode digitar um número menor que o primeiro número.");
        System.out.println("Digite um número inicial: ");
        int n1 = sc.nextInt();
        sc.nextLine();

        int n2;
        while (true) {
            System.out.println("Digite outro número: ");
            n2 = sc.nextInt();
            sc.nextLine();

            if (n2 < n1) {
                System.out.println("O segundo número precisa ser maior que o primeiro número, que é: " + n1);
            } else {
                System.out.println(n2 + " dividivo por " + n1 + " sobra " + n2 % n1);
                if (n2 % n1 == 0) {
                    break;
                }
            }
        }

        System.out.println("=== Aplicativo encerrado, " + n2 + " divivido por " + n1 + " retornou 0!");

        sc.close();

    }

}

