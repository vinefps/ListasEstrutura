package L_03;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        ListaEncadeada listaEncadeada = new ListaEncadeada();
        int escolha;

        while(true){
            System.out.println("Menu");
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Inserir elemento no início da lista");
            System.out.println("2 - Inserir elemento no final da lista");
            System.out.println("3 - Inserir elemento em posição específica da lista");
            System.out.println("4 - Remover elemento do início da lista");
            System.out.println("5 - Remover elemento do final da lista");
            System.out.println("6 - Remover elemento de uma posição específica da lista");
            System.out.println("7 - Remover elemento específico da lista");
            System.out.println("8 - Exibir elementos da lista");
            System.out.println("9 - Pesquisar elemento na lista");
            System.out.println("10 - Pesquisar a quantidade de elementos da lista");
            System.out.println("11 - Sair");

            System.out.print("Digite o número de 1 a 11: ");
            escolha = sc.nextInt();

            if (escolha == 11){
                break;
            }

            switch (escolha){
                case 1:
                    System.out.print("Digite o elemento que deseja inserir: ");
                    listaEncadeada.InserirInicio(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Digite o elemento que deseja inserir: ");
                    listaEncadeada.InserirFinal(sc.nextInt());
                    break;
                case 3:

                    break;
                case 4:
                    listaEncadeada.RemoverInicio();
                    break;
                case 5:
                    listaEncadeada.RemoverFinal();
                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    listaEncadeada.ExibirElementos();
                    break;
                case 9:
                    System.out.print("Digite o elemento a ser localizado na lista: ");
                    listaEncadeada.PesquisarElemento(sc.nextInt());
                    break;
                case 10:
                    listaEncadeada.PesquisarQuantidade();
                default:
                    System.out.println("Digite uma das opções válidas!");
                    break;
            }
        }
    }
}
