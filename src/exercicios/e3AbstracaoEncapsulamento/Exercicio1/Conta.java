package exercicios.e3AbstracaoEncapsulamento.Exercicio1;

public class Conta {
    private double saldo;
    private final double chequeEspecial;


    public Conta(double saldo) {
        this.saldo = saldo;
        if (saldo <= 500.00) {
            this.chequeEspecial = 50.00;
        } else {
            this.chequeEspecial = saldo * 0.5;
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public double consultarChequeEspecial() {
        return chequeEspecial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    /**
     * Essa função não fez sentido, pois não existe regras para implementar
     * @return
     */
    public boolean pagarBoleto() {
        return true;
    }
}
