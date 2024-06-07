package L_06;

public class Fila {
    private Nodo frente;
    private Nodo traseira;
    private int tamanho;

    // Criar uma fila vazia
    public Fila() {
        this.frente = null;
        this.traseira = null;
        this.tamanho = 0;
    }

    // Inserir um elemento na fila
    public void enfileirar(int valor) {
        Nodo novoNodo = new Nodo(valor);
        if (traseira != null) {
            traseira.proximo = novoNodo;
        }
        traseira = novoNodo;
        if (frente == null) {
            frente = novoNodo;
        }
        tamanho++;
    }

    // Remover um elemento da fila
    public int desenfileirar() {
        if (estaVazia()) {
            throw new IllegalStateException("A fila está vazia");
        }
        int valor = frente.valor;
        frente = frente.proximo;
        if (frente == null) {
            traseira = null;
        }
        tamanho--;
        return valor;
    }

    // Exibir o conteúdo da fila
    public void exibirFila() {
        if (estaVazia()) {
            System.out.println("A fila está vazia");
            return;
        }
        Nodo atual = frente;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    // Retornar o número de elementos na fila
    public int tamanho() {
        return tamanho;
    }

    // Verificar se um valor específico está na fila
    public boolean contem(int valor) {
        Nodo atual = frente;
        while (atual != null) {
            if (atual.valor == valor) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    // Método auxiliar para verificar se a fila está vazia
    public boolean estaVazia() {
        return frente == null;
    }

    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        System.out.println("Conteúdo da fila:");
        fila.exibirFila(); // Deve imprimir 1 2 3
        System.out.println("Desenfileirar: " + fila.desenfileirar()); // Deve imprimir 1
        System.out.println("Conteúdo da fila:");
        fila.exibirFila(); // Deve imprimir 2 3
        System.out.println("A fila contém o valor 2? " + fila.contem(2)); // Deve imprimir true
        System.out.println("A fila contém o valor 4? " + fila.contem(4)); // Deve imprimir false
        System.out.println("Tamanho da fila: " + fila.tamanho()); // Deve imprimir 2
    }
}