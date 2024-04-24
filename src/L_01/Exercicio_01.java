package L_01;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[]args){


        Scanner sc = new Scanner(System.in);
        int qtd_elementos = 10;
        int [] vetor = new int [qtd_elementos];

        for(int i = 0; i < qtd_elementos; i++){
            System.out.printf("Digite o %d° elemento do vetor: ", i + 1);
            vetor[i] = sc.nextInt();
        }


        System.out.print("Elementos pares do vetor:\n");
        for(int i = 0; i < qtd_elementos; i++){
            if( vetor[i] % 2 == 0){
                System.out.println(vetor[i]);
            }
        }

        System.out.print("Elementos ímpares do vetor:\n");
        for(int i = 0; i < qtd_elementos; i++){
            if(vetor[i] % 2 != 0){
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
