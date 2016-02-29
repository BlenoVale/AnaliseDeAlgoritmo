package ordenacao;

/**
 *
 * @author Dan Jhoantan
 */
public class CountingSort {

    public static void countingSort(int vetor[], int maiorValor) {
        int n = vetor.length;
        int maior = maiorValor + 1;

        int vetorAuxiliar[] = new int[maior];

        //1ª - (Inicializar com zero)
        for (int i = 0; i < maior; i++)
            vetorAuxiliar[i] = 0;

        //2ª - Contagem das ocorrencias
        for (int i = 0; i < n; i++)
            vetorAuxiliar[vetor[i]]++;

        //3ª - Ordenando os indices do vetor auxiliar
        int sum = 0;
        for (int i = 1; i < maior; i++) {
            int dum = vetorAuxiliar[i];
            vetorAuxiliar[i] = sum;
            sum += dum;
        }
        int vetorOrdenado[] = new int[n];
        for (int i = 0; i < n; i++) {
            vetorOrdenado[vetorAuxiliar[vetor[i]]] = vetor[i];
            vetorAuxiliar[vetor[i]]++;
        }

        //4ª Retornando os valores ordenados para o vetor de entrada
        for (int i = 0; i < n; i++)
            vetor[i] = vetorOrdenado[i];
    }
}
