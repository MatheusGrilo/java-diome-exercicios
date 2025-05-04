package exercicios.e3AbstracaoEncapsulamento.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;
        int opcao;
        MaquinaDeBanho maquina = new MaquinaDeBanho();
        Scanner sc = new Scanner(System.in);
        while (continuar) {
            System.out.println("===== Menu do Pet Shop ====");
            System.out.println("1. Dar banho no pet.");
            System.out.println("2. Abastecer com água.");
            System.out.println("3. Abastecer com Shampoo.");
            System.out.println("4. Verificar nível de água e shampoo.");
            System.out.println("5. Verificar se há pet tomando banho.");
            System.out.println("6. Colocar pet na máquina.");
            System.out.println("7. Tirar pet da máquina.");
            System.out.println("8. Limpar máquina.");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    maquina.darBanhoNoPet();
                    break;
                case 2:
                    maquina.abastecerAgua();
                    break;
                case 3:
                    maquina.abastecerShampoo();
                    break;
                case 4:
                    maquina.verificarAguaEShampoo();
                    break;
                case 5:
                    maquina.verificarSeTemPetNaMaquina();
                    break;
                case 6:
                    maquina.colocarPetNaMaquina();
                    break;
                case 7:
                    maquina.removerPetDaMaquina();
                    break;
                case 8:
                    maquina.limparMaquina();
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção digitada inválida, verifique e tente novamente.");
                    break;
            }

        }
        sc.close();
        System.out.println("Finalizando sistema de Pet Shop, obrigado pela preferência...");


    }
}
