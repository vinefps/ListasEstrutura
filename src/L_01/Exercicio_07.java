package L_01;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[]args){


        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de linhas e colunas da matriz quadrada: ");
        int quantidade_linhas_colunas = sc.nextInt();
        int [][] matriz = new int[quantidade_linhas_colunas][quantidade_linhas_colunas];
        int [][] matriz_quadrada = new int[quantidade_linhas_colunas][quantidade_linhas_colunas];
        for(int i = 0; i < quantidade_linhas_colunas; i++){
            for(int j = 0; j < quantidade_linhas_colunas; j++){
                System.out.printf("Digite o %d° elemento da %d° linha: ", j + 1, i + 1);
                matriz[i][j] = sc.nextInt();
            }
        }



        for(int i = 0; i < quantidade_linhas_colunas; i++){
            for(int j = 0; j < quantidade_linhas_colunas; j++){
                matriz_quadrada[i][j] = matriz[i][j];
            }
        }

        for(int i = 0; i < quantidade_linhas_colunas; i++){
            for(int j = 0; j < quantidade_linhas_colunas; j++){
                System.out.printf("%d ", matriz_quadrada[i][j]);
            }
            System.out.println();
        }
    }
}
