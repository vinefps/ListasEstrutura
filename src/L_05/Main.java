package Lista_05;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        Pilha pilha = new Pilha();

        while(true){

            System.out.println("=================== MENU ===================");
            System.out.println("1 - Inserir um elemento da pilha.");
            System.out.println("2 - Remover um elemento da pilha.");
            System.out.println("3 - Exibir pilha.");
            System.out.println("4 - Exibir quantidade de elementos da pilha.");
            System.out.println("5 - Sair.");
            System.out.println("============================================");

            System.out.print("Escolha uma das opções acima: ");
            int escolha = sc.nextInt();

            if(escolha == 5){
                break;
            }

            switch (escolha){
                case 1 -> {
                    System.out.print("Digite o elemento a ser inserido: ");
                    pilha.push(sc.nextInt());
                }
                case 2 -> {
                    pilha.pop();
                }
                case 3 -> {
                    pilha.exibirPilha();
                }
                case 4 -> {
                    pilha.size();
                }
                default -> {
                    System.out.println("Digite uma das opções válidas!");
                }
            }
        }
    }
}
