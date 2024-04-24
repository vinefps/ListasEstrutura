package L_01;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd_linhas = 3;
        int qtd_colunas = 3;
        int[][] matriz = new int[qtd_linhas][qtd_linhas];
        for (int i = 0; i < qtd_linhas; i++) {
            System.out.printf("Digite os elementos da linha %d: ", i);
            for (int j = 0; j < qtd_colunas; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        qtd_colunas = 5;
        int[][] matriz_determinante = new int[qtd_linhas][qtd_colunas];
        for (int i = 0; i < qtd_linhas; i++) {
            for (int j = 0; j < qtd_colunas; j++) {
                if (j >= 3) {
                    matriz_determinante[i][j] = matriz[i][j - 3];
                } else {
                    matriz_determinante[i][j] = matriz[i][j];
                }
            }
        }
        int produto_diagona_principal = 1;
        int produto_diagonal_paralela_um = 1;
        int produto_diagonal_paralela_dois = 1;
        int produto_diagonal_secundaria = 1;
        int produto_diagonal_paralela_tres = 1;
        int produto_diagonal_paralela_quatro = 1;
        for (int i = 0; i < qtd_linhas; i++){
            for (int j = 0; j < qtd_colunas; j++){
                if (i == j){
                    produto_diagona_principal *= matriz_determinante[i][j];
                    produto_diagonal_paralela_um *= matriz_determinante[i][j + 1];
                    produto_diagonal_paralela_dois *= matriz_determinante[i][j + 2];
                }
            }
        }
        int coluna = 4;
        for (int i = 0; i < qtd_linhas; i++) {
            for (int j = qtd_colunas - 1; j > 1; j--) {
                if (j == coluna) {
                    produto_diagonal_secundaria *= matriz_determinante[i][j - 2];
                    produto_diagonal_paralela_tres *= matriz_determinante[i][j - 1];
                    produto_diagonal_paralela_quatro *= matriz_determinante[i][j];
                }
            }
            coluna --;
        }
        int soma_1 = produto_diagona_principal + produto_diagonal_paralela_um + produto_diagonal_paralela_dois;
        int soma_2 = produto_diagonal_secundaria + produto_diagonal_paralela_tres + produto_diagonal_paralela_quatro;
        int determinante = soma_1 - soma_2;
        System.out.printf("O determinante da matriz digitada é: %d", determinante);
    }
}
