package exercicios.e3AbstracaoEncapsulamento.Exercicio2;

public class Carro {
    boolean ligado = false;
    int velocidade = 0;
    int marcha = 0;


    public void ligar() {
        if (ligado) {
            System.out.println("O carro já está ligado.");
        } else {
            ligado = true;
            System.out.println("O carro foi ligado.");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("O carro já está desligado.");
        } else {
            if (marcha == 0 && velocidade == 0) {
                ligado = false;
                System.out.println("O carro foi desligado.");
            } else {
                System.out.println("O carro deve estar parado (0km/h) e na marcha Neutra (0) para ser desligado.");
            }
        }
    }

    public void trocarMarcha() {
        boolean alterada = false;
        if (!ligado) {
            System.out.println("Carro desligado, não há como trocar de marcha.");
        } else {
            switch (velocidade) {
                case 0:
                    if (marcha == 1) {
                        marcha = 0;
                        alterada = true;
                    } else if (marcha == 0) {
                        marcha = 1;
                        alterada = true;
                    }
                    break;
                case 20:
                    if (marcha == 1) {
                        marcha = 2;
                        alterada = true;
                    } else if (marcha == 2) {
                        marcha = 1;
                        alterada = true;
                    }
                    break;
                case 40:
                    if (marcha == 2) {
                        marcha = 3;
                        alterada = true;
                    } else if (marcha == 3) {
                        marcha = 2;
                        alterada = true;
                    }
                    break;
                case 60:
                    if (marcha == 3) {
                        marcha = 4;
                        alterada = true;
                    } else if (marcha == 4) {
                        marcha = 3;
                        alterada = true;
                    }
                    break;
                case 80:
                    if (marcha == 4) {
                        marcha = 5;
                        alterada = true;
                    } else if (marcha == 5) {
                        marcha = 4;
                        alterada = true;
                    }
                    break;
                case 100:
                    if (marcha == 5) {
                        marcha = 6;
                        alterada = true;
                    } else if (marcha == 6) {
                        marcha = 5;
                        alterada = true;
                    }
                    break;
                default:
                    break;

            }

            if (alterada) {
                System.out.println("Marcha trocada, velocidade atual: " + velocidade + "km/h");
                System.out.println("Marcha atual: " + marcha);
            } else {
                System.out.println("Marcha não trocada, velocidade atual: " + velocidade + "km/h");
                System.out.println("Marcha atual: " + marcha);
            }
        }
    }

    public void acelerar() {
        boolean acelerado = true;
        switch (marcha) {
            case 0:
                break;
            case 1:
                if (velocidade >= 0 && velocidade < 20) velocidade += 10;
                else acelerado = false;
                break;
            case 2:
                if (velocidade >= 20 && velocidade < 40) velocidade += 10;
                else acelerado = false;
                break;
            case 3:
                if (velocidade >= 40 && velocidade < 60) velocidade += 10;
                else acelerado = false;
                break;
            case 4:
                if (velocidade >= 60 && velocidade < 80) velocidade += 10;
                else acelerado = false;
                break;
            case 5:
                if (velocidade >= 80 && velocidade < 100) velocidade += 10;
                else acelerado = false;
                break;
            case 6:
                if (velocidade >= 100 && velocidade < 120) velocidade += 10;
                else acelerado = false;
                break;
            default:
                System.out.println("Marcha não existente.");
        }

        if (acelerado && marcha > 0 && marcha <= 6) {
            System.out.println("Carro acelerado para: " + velocidade + " km/h");
        } else {
            if (marcha == 0) {
                System.out.println("Não é possível acelerar o carro na marcha neutra");
            } else {
                System.out.println("Para acelarar acima de " + velocidade + " km/h, aumente a marcha.");
            }
        }

    }

    public void virarParaDireita() {
        if (velocidade > 0 && velocidade <= 40) {
            System.out.println("Carro virou à direita na velocidade: " + velocidade + "km/h");
        }
    }

    public void virarParaEsquerda() {
        if (velocidade > 0 && velocidade <= 40) {
            System.out.println("Carro virou à esquerda na velocidade: " + velocidade + "km/h");
        }
    }

    public void desacelerar() {
        boolean desacelerado = true;
        switch (marcha) {
            case 0:
                break;
            case 1:
                if (velocidade > 0 && velocidade <= 20) velocidade -= 10;
                else desacelerado = false;
                break;
            case 2:
                if (velocidade > 20 && velocidade <= 40) velocidade -= 10;
                else desacelerado = false;
                break;
            case 3:
                if (velocidade > 40 && velocidade <= 60) velocidade -= 10;
                else desacelerado = false;
                break;
            case 4:
                if (velocidade > 60 && velocidade <= 80) velocidade -= 10;
                else desacelerado = false;
                break;
            case 5:
                if (velocidade > 80 && velocidade <= 100) velocidade -= 10;
                else desacelerado = false;
                break;
            case 6:
                if (velocidade > 100 && velocidade <= 120) velocidade -= 10;
                else desacelerado = false;
                break;
            default:
                System.out.println("Marcha não existente.");
        }

        if (desacelerado && marcha > 0 && marcha <= 6) {
            System.out.println("Carro desacelerado para: " + velocidade + " km/h");
        } else {
            if (marcha == 0) {
                System.out.println("Não é possível desacelerar o carro na marcha neutra");
            } else {
                System.out.println("Para desacelarar abaixo de " + velocidade + " km/h, diminua a marcha.");
            }
        }
    }

    public void verificarVelocidadeEMarcha() {
        System.out.println("Velocidade atual: " + velocidade + "km/h");
        System.out.println("Marcha atual: " + marcha);
    }


}
