package exercicios.e2Estruturas;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um primeiro número: ");
        int n1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite um segundo número, maior que o primeiro");
        int n2 = sc.nextInt();
        sc.nextLine();
        if (n1 < n2) {
            System.out.println("Escolha entre par (2,4,6,8, ...) ou impar (1,3,5,7, ...)");
            int escolha = sc.nextInt();
            sc.nextLine();
            if (escolha % 2 == 0) {
                for (int i = n1; i <= n2; i++) {
                    if (i % 2 == 0 && i <= n2 - 2) {
                        System.out.print(i + ", ");
                    } else if (i % 2 == 0 && (i == n2 || i == n2 - 1)) {
                        System.out.print(i);
                    }
                }
            } else if (escolha % 2 == 1) {
                for (int i = n1; i <= n2; i++) {
                    if (i % 2 == 1 && i <= n2 - 2) {
                        System.out.print(i + ", ");
                    } else if (i % 2 == 1 && (i == n2 || i == n2 - 1)) {
                        System.out.print(i);
                    }
                }

            } else {
                System.out.println("Você digitou um número menor que zero, precisa ser par ou impar.");
            }
        } else {
            System.out.println("Você digitou um segundo número menor que o primeiro.");
        }

        sc.close();
    }
}
