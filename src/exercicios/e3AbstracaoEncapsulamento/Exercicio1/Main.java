package exercicios.e3AbstracaoEncapsulamento.Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o saldo para iniciar sua conta: ");
        double saldo = sc.nextDouble();
        Conta conta = new Conta(saldo);
        sc.nextLine();

        boolean continuar = true;

        while (continuar) {
            System.out.println("===== Menu =====");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Cheque Especial");
            System.out.println("3 - Depositar Dinheiro");
            System.out.println("4 - Sacar Dinheiro");
            System.out.println("5 - Pagar Boleto (?)");
            System.out.println("6 - Verificar se Cheque Especial está ativo");
            System.out.println("================");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo da conta: R$" + conta.consultarSaldo());
                    Thread.sleep(2000);
                    break;
                case 2:
                    System.out.println("Cheque Especial: R$" + conta.consultarChequeEspecial());
                    Thread.sleep(2000);
                    break;
                case 3:
                    System.out.println("Digite o valor para depositar: ");
                    double deposito = sc.nextDouble();
                    sc.nextLine();
                    conta.depositar(deposito);
                    System.out.println("R$" + deposito + " depositado com sucesso!");
                    System.out.println("Saldo atual: R$" + conta.consultarSaldo());
                    Thread.sleep(2000);
                    break;
                case 4:
                    System.out.println("Digite o valor para sacar: ");
                    double saque = sc.nextDouble();
                    sc.nextLine();
                    if(conta.consultarSaldo() >= saque) {
                        conta.sacar(saque);
                        System.out.println("R$" + saque + " sacado com sucesso!");
                        System.out.println("Saldo atual: R$" + conta.consultarSaldo());
                    } else {
                        System.out.println("Você está tentando sacar R$" + saque + ", porém seu saldo é de R$" + conta.consultarSaldo());
                    }
                    Thread.sleep(2000);
                    break;
                case 6:
                    System.out.println("Saindo do sistema, obrigado por usar nossos serviços.");
                    Thread.sleep(2000);
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    Thread.sleep(2000);
                    break;
            }

        }
    }
}
