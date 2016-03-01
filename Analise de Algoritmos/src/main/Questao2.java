package main;

import ordenacao.Ordenacao;

/**
 *
 * @author Dan Jhonatan
 */
public class Questao2 {

    private final Ordenacao ord = new Ordenacao();

    private int ARRAY_SIZE = 2000000;
    private final int INCREMENTO = 200000; // 
    private final int NUM_VETORES_PARA_TESTAR = 11; // Numero de vetores que seraoh organizados no heap.
    private final int NUM_TESTES_POR_VETOR = 2; // Cada vetor serah organizado N vezes. No final tira-se a mehdia.

    private int vetorPrincipal[];

    public Questao2() {
        System.out.println("Y = Tamanho do vetor\nX = Tempo de execução\n");
        System.out.println("Y\tX");
        for (int i = 0; i < NUM_VETORES_PARA_TESTAR; i++) {

            vetorPrincipal = new int[ARRAY_SIZE];
            int[] vetorAuxiliar = new int[ARRAY_SIZE];
            Numero.gerarNumerosAleatorios(vetorPrincipal, ARRAY_SIZE);
            //Numero.gerarNumerosCrescente(vetorAuxiliar);
            //Numero.gerarNumerosDecrescente(vetorAuxiliar);

            long somaTempoGasto = 0;
            for (int j = 0; j < NUM_TESTES_POR_VETOR; j++) {
                System.arraycopy(vetorPrincipal, 0, vetorAuxiliar, 0, ARRAY_SIZE);

                long tempoGasto = experimento(vetorAuxiliar);
                somaTempoGasto += tempoGasto;
            }

            final long media = somaTempoGasto / NUM_TESTES_POR_VETOR;
            System.out.println(ARRAY_SIZE + "\t" + media);
           
            ARRAY_SIZE += INCREMENTO;
        }
    }

    private long experimento(int vetor[]) {

        long inicio = System.currentTimeMillis();
        ord.heapsort(vetor);
        long fim = System.currentTimeMillis();

        return fim - inicio;
    }

}
