package L_01;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[]args){


        Scanner sc = new Scanner(System.in);
        int qtd_elementos = 10;
        int [] vetor = new int [qtd_elementos];
        for(int i = 0; i < qtd_elementos; i++){
            if (i == 0){
                System.out.print("Digite o primeiro elemento do vetor: ");
                vetor[i] = sc.nextInt();
            }
            else {
                vetor[i] = vetor[i - 1] * 2;
            }
        }


        for(int i = 0; i < qtd_elementos; i++){
            System.out.printf("%d° elemento: %d\n", i + 1, vetor[i]);
        }

        sc.close();
    }
}
