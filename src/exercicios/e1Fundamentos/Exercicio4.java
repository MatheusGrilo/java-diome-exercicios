package exercicios.e1Fundamentos;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da primeira pessoa: ");
        String nome = sc.nextLine();
        System.out.println("Digite a idade da primeira pessoa: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome da segunda pessoa: ");
        String nome2 = sc.nextLine();
        System.out.println("Digite a idade da segunda pessoa: ");
        int idade2 = sc.nextInt();

        if (idade > idade2) {
            System.out.println(nome + " é " + (idade - idade2) + " anos mais velho(a) que " + nome2);
        } else if (idade < idade2) {
            System.out.println(nome2 + " é " + (idade2 - idade) + " anos mais velho(a) que " + nome);
        } else {
            System.out.println(nome + " e " + nome2 + " têm a mesma idade, que é " + idade);
        }

        sc.close();
    }
}
