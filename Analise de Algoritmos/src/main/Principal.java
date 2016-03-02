package main;

import ordenacao.BucketSort;
import ordenacao.QuickSort;

/**
 * Classe destinada a respostas da lista de atividades do trabalho
 *
 * @author Bleno, Dan Jhonatan, Daniel
 */
public class Principal {

    public Principal() {

//        new Questao2();
//        questao1();
        questao3();
    }

    private void questao1() {
        int[] input = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};
        new QuickSort().sort(input);
        printArray(input);
    }

    private void questao3() {
        int[] input = {5,3,0,2,4,1,0,5,2,3,1,4}; 
        printArray(new BucketSort().sort(input));
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
