package L_01;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[]args){

        // Entrada de Dados
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de elementos: ");
        int qtd_elementos = sc.nextInt();
        int [] vetor = new int [qtd_elementos];

        // Processamento de Dados
        vetor[0] = 0;
        vetor[1] = 1;
        for(int i = 2; i < qtd_elementos; i++){
            vetor[i] = vetor[i - 1] + vetor[i - 2];
        }

        // Saída de Dados
        for(int i = 0; i < qtd_elementos; i++){
            System.out.printf("%d° elemento: %d\n", i + 1, vetor[i]);
        }

        sc.close();
    }
}
