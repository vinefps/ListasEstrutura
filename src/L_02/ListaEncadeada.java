package L_02;

import java.util.Scanner;

public class ListaEncadeada {

    Scanner sc = new Scanner(System.in);

    public int [] vetor;
    public int ultimo;
    public int tamanho;


    public ListaEncadeada(){
        System.out.println("Criar nova lista");
        System.out.print("Digite o tamanho da lista: ");
        this.tamanho = sc.nextInt();
        this.vetor = new int [this.tamanho];
        this.ultimo = -1;
    }


    public void InserirInicio(int elemento){
        if (this.ultimo == -1){
            vetor[0] = elemento;
            this.ultimo++;
        }
        else {
            for(int i = this.ultimo; i >= 0; i--){
                this.vetor[i + 1] = this.vetor[i];
            }
            this.vetor[0] = elemento;
            this.ultimo++;
        }
    }

    public void InserirFinal(int elemento){
        if (this.ultimo == -1){
            vetor[0] = elemento;
            this.ultimo++;
        }
        else {
            this.vetor[this.ultimo + 1] = elemento;
            this.ultimo++;
        }
    }

    public void InserirEspecifico(int elemento, int posicao){
        if(posicao > this.ultimo){
            this.ultimo ++;
            this.vetor[this.ultimo] = elemento;
        }
        else {
            for(int i = this.ultimo; i >= posicao; i--){
                this.vetor[i + 1] = this.vetor[i];
            }
            this.vetor[posicao] = elemento;
            this.ultimo++;
        }
    }

    // Remoção de um elemento do início da lista
    public void RemoverInicio(){
        for(int i = 0; i < this.ultimo; i++){
            this.vetor[i] = this.vetor[i + 1];
        }
        this.ultimo--;
    }

    // Remoção de um elemento do final da lista
    public void RemoverFinal(){
        this.ultimo--;
    }

    // Remoção de um elemento de uma posição específica da lista
    public void RemoverEspecifico(int posicao){
        for(int i = posicao; i < this.ultimo; i++){
            this.vetor[i] = this.vetor[i + 1];
        }
        this.ultimo--;

    }

    // Remoção de um elemento específico da lista
    public void RemoverElementoEspecifico(int elemento) {
        int posicao = 0;
        for (int i = 0; i <= this.ultimo; i++) {
            if (this.vetor[i] == elemento) {
                posicao = i;
                break;
            } else {
                posicao = -1;
            }
        }
        if (posicao != -1) {
            if (posicao == 0) {
                RemoverInicio();
            } else if (posicao == this.ultimo) {
                RemoverFinal();
            }
            else {
                RemoverEspecifico(posicao);
            }
        }
        else {
            System.out.println("Elemento não localizado na lista!");
        }
    }

    // Pesquisar elemento na lista
    public void PesquisarElemento(int elemento){
        int posicao = 0;
        for(int i = 0; i <= this.ultimo; i++){
            if(this.vetor[i] == elemento){
                posicao = i;
                break;
            }
            else {
                posicao = -1;
            }
        }
        if (posicao != -1){
            System.out.printf("Elemento localizado na posição: %d\n", posicao);
        }
        else {
            System.out.println("Elemento não localizado na lista!");
        }
    }

    // Exibir o conteúdo da lista
    public void ExibirLista(){
        System.out.println("Lista:");
        for(int i = 0; i <= this.ultimo; i++){
            System.out.printf("%d ", this.vetor[i]);
        }
        System.out.println();
    }

    // Exibir o número de elementos da lista
    public void TamanhoLista(){
        int soma = 0;
        for(int i = 0; i <= this.ultimo; i++){
            soma++;
        }
        System.out.printf("Número de elementos da lista: %d\n", soma);

    }
}
