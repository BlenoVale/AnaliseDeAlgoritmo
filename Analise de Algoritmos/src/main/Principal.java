package main;

/**
 *
 * @author Bleno, Dan Jhonatan, Daniel
 */
public class Principal {

    Ordenacao ord = new Ordenacao();
    int[] input = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};

    public Principal() {

        questao1(input);
        printArray();
        
//        questao2();
//        questao3();

    }

    private void questao1(int[] input) {
        new QuickSort().sort(input);
    }

    private void questao2() {
    }

    private void questao3() {
    }

    private void printArray() {
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
