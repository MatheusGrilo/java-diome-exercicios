package exercicios.e3AbstracaoEncapsulamento.Exercicio3;

public class MaquinaDeBanho {
    final int NIVEL_MAXIMO_DE_AGUA = 30;
    final int NIVEL_MAXIMO_DE_SHAMPOO = 10;
    final int AGUA_PARA_BANHO = 10;
    final int SHAMPOO_PARA_BANHO = 2;
    final int AGUA_PARA_LIMPEZA = 3;
    final int SHAMPOO_PARA_LIMPEZA = 1;

    boolean petTomandoBanho = false;
    boolean maquinaSuja = false;
    int nivelDeAgua;
    int nivelDeShampoo;

    public void colocarPetNaMaquina() {
        if (petTomandoBanho) {
            System.out.println("Já existe um pet tomando banho na máquina!");
        } else {
            petTomandoBanho = true;
            System.out.println("Pet colocado na máquina para tomar banho.");
        }
    }

    public void removerPetDaMaquina() {
        if (petTomandoBanho) {
            petTomandoBanho = false;
            System.out.println("Pet retirado da máquina.");
        } else {
            System.out.println("Nenhum pet na máquina no momento.");
        }
    }

    public void abastecerAgua() {
        if (nivelDeAgua == NIVEL_MAXIMO_DE_AGUA) {
            System.out.println("Nivel de água já está no máximo (" + NIVEL_MAXIMO_DE_AGUA + " Litros).");
        } else if (nivelDeAgua == NIVEL_MAXIMO_DE_AGUA - 1) {
            System.out.println("Nivel de água está QUASE no máximo (" + nivelDeAgua + "/" + NIVEL_MAXIMO_DE_AGUA + ").");
        } else {
            nivelDeAgua += 2;
            System.out.println("Foram abastecido(s): " + nivelDeAgua + " litro(s) de água.");
            System.out.println("Nivel de Água: " + nivelDeAgua + "/" + NIVEL_MAXIMO_DE_AGUA);
        }
    }

    public void abastecerShampoo() {
        if (nivelDeShampoo == NIVEL_MAXIMO_DE_SHAMPOO) {
            System.out.println("Nivel de shampoo já está no máximo (" + NIVEL_MAXIMO_DE_SHAMPOO + " Litros).");
        } else if (nivelDeShampoo == NIVEL_MAXIMO_DE_SHAMPOO - 1) {
            System.out.println("Nivel de shampoo está QUASE no máximo (" + nivelDeShampoo + "/" + NIVEL_MAXIMO_DE_SHAMPOO + ").");
        } else {
            nivelDeShampoo += 2;
            System.out.println("Foram abastecido(s): 2 litro(s) de shampoo.");
            System.out.println("Nivel de shampoo: " + nivelDeShampoo + "/" + NIVEL_MAXIMO_DE_SHAMPOO);
        }
    }

    public void limparMaquina() {
        if (!petTomandoBanho && maquinaSuja) {
            if (nivelDeAgua >= AGUA_PARA_LIMPEZA && nivelDeShampoo >= SHAMPOO_PARA_LIMPEZA) {
                nivelDeAgua -= AGUA_PARA_LIMPEZA;
                nivelDeShampoo -= SHAMPOO_PARA_LIMPEZA;
                System.out.println("Máquina limpa com sucesso. Verifique os níveis de água e shampoo.");
            } else {
                System.out.println("É necessário " + AGUA_PARA_LIMPEZA + " L de água e " + SHAMPOO_PARA_LIMPEZA + " L de shampoo para realizar a limpeza.");
                System.out.println("Atualmente há " + nivelDeAgua + " L de água e " + nivelDeShampoo + " L de shampoo.");
            }

        } else if (!maquinaSuja) {
            System.out.println("A máquina não está suja no momento.");
        } else {
            System.out.println("Há um pet na máquina, retire-o para realizar a limpeza.");
        }
    }

    public void darBanhoNoPet() {
        if (petTomandoBanho && !maquinaSuja) {
            if (nivelDeAgua >= AGUA_PARA_BANHO && nivelDeShampoo >= SHAMPOO_PARA_BANHO) {
                nivelDeAgua -= AGUA_PARA_BANHO;
                nivelDeShampoo -= SHAMPOO_PARA_BANHO;
                System.out.println("Pet completamente limpo!");
            } else if (nivelDeAgua <= AGUA_PARA_BANHO) {
                nivelDeAgua = 0;
                maquinaSuja = true;
                System.out.println("Água insuficiente para dar banho no pet.");
            } else if (nivelDeShampoo <= SHAMPOO_PARA_BANHO) {
                nivelDeShampoo = 0;
                maquinaSuja = true;
                System.out.println("Shampoo insuficiente para dar banho no pet.");
            } else {
                nivelDeAgua -= AGUA_PARA_BANHO;
                nivelDeShampoo -= SHAMPOO_PARA_BANHO;
                maquinaSuja = true;
                System.out.println("Água e shampoo insuficientes para dar banho no pet.");
            }

        } else if (maquinaSuja) {
            System.out.println("A máquina atualmente está suja, e precisa de uma limpeza.");
        } else System.out.println("Não há pet na máquina para dar banho.");
    }

    public void verificarAguaEShampoo() {
        System.out.println("Nível de água atual: " + nivelDeAgua + "/" + NIVEL_MAXIMO_DE_AGUA);
        System.out.println("Nível de shampoo atual: " + nivelDeShampoo + "/" + NIVEL_MAXIMO_DE_SHAMPOO);
    }


    public void verificarSeTemPetNaMaquina() {
        if (petTomandoBanho) {
            System.out.println("Existe um pet tomando banho no momento.");
        } else System.out.println("Não existe pet tomando banho no momento.");
    }

}
