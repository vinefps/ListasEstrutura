package L_01;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int qtd_elementos = 10;
        int [] vetor = new int [qtd_elementos];
        for(int i = 0; i < qtd_elementos; i++){

            System.out.printf("Digite o %d° elemento do vetor: ", i + 1);
            vetor[i] = sc.nextInt();
        }


        double soma_numerador = 0;
        double soma_denominador = 0;
        double media_ponderada;
        for(int i = 0; i < qtd_elementos; i++){
            soma_numerador += (vetor[i] * i);
            soma_denominador += i;
        }
        media_ponderada = soma_numerador / soma_denominador;


        System.out.printf("A média ponderada é %.2f%n", media_ponderada);

        sc.close();
    }
}
