package exercicios.e3AbstracaoEncapsulamento.Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;
        int opcao;
        Carro carro = new Carro();
        Scanner sc = new Scanner(System.in);
        while (continuar) {
            System.out.println("===== Menu do Carro ====");
            System.out.println("1. Ligar o carro.");
            System.out.println("2. Desligar o carro.");
            System.out.println("3. Acelerar o carro.");
            System.out.println("4. Desacelerar o carro.");
            System.out.println("5. Virar à esquerda.");
            System.out.println("6. Virar à direita.");
            System.out.println("7. Verificar velocidade e marcha.");
            System.out.println("8. Trocar marcha.");
            System.out.println("0. Sair.");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.desligar();
                    break;
                case 3:
                    carro.acelerar();
                    break;
                case 4:
                    carro.desacelerar();
                    break;
                case 5:
                    carro.virarParaEsquerda();
                    break;
                case 6:
                    carro.virarParaDireita();
                    break;
                case 7:
                    carro.verificarVelocidadeEMarcha();
                    break;
                case 8:
                    carro.trocarMarcha();
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção não existente.");

                    break;


            }


        }

        sc.close();

        System.out.println("Saindo do carro...");

    }
}
