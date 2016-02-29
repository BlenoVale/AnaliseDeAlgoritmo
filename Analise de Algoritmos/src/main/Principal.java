package main;

import ordenacao.QuickSort;
import ordenacao.Ordenacao;

/**
 * Classe destinada a respostas da lista de atividades do trabalho
 *
 * @author Bleno, Dan Jhonatan, Daniel
 */
public class Principal {

    private final Ordenacao ord = new Ordenacao();

    public Principal() {

        questao1();

//        questao2();
//        questao3();
    }

    private void questao1() {
        int[] input = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};
        new QuickSort().sort(input);
        printArray(input);
    }

    private void questao2() {
    }

    private void questao3() {
    }

    private void printArray(int input[]) {
        System.out.print("Vetor de Saída: ");
        for (int i : input) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.print("\n\n");
    }

    public static void main(String[] args) {
        new Principal();
    }
}
