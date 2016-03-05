package teste;

import main.Numero;
import ordenacao.QuickSort;

/**
 *
 * @author Bleno Vale
 */
public class ClasseTesteBleno {

    public static void main(String[] args) {

        int[] input = new int[6000000];

        Numero.gerarNumerosDecrescente(input);

        new QuickSort().sort(input);

    }

}
