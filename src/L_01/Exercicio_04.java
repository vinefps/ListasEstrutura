package L_01;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio_04 {
    public static void main(String[]args){

        // Entrada de dados
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int qtd_elementos = 100;
        double [] vetor = new double[qtd_elementos];
        for(int i = 0; i < qtd_elementos; i++){
            if(i == 0){
                System.out.print("Digite o primeiro elemento do vetor: ");
                vetor[i] = sc.nextDouble();
            }
            else{
                vetor[i] = vetor[i - 1] / 2;
            }
        }

        // Saída de Dados
        for(int i = 0; i < qtd_elementos; i++){
            System.out.printf("%d° elemento: %.2f\n", i + 1, vetor[i]);
        }

        sc.close();
    }
}
