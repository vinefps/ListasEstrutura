package L_07;

public class Fila {
    private int[] elementos;
    private int capacidade;
    private int tamanho;
    private int frente;
    private int traseira;

    // Criar uma fila vazia
    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.tamanho = 0;
        this.frente = 0;
        this.traseira = -1;
    }

    // Inserir um elemento na fila
    public void enfileirar(int valor) {
        if (tamanho == capacidade) {
            throw new IllegalStateException("A fila está cheia");
        }
        traseira = (traseira + 1) % capacidade;
        elementos[traseira] = valor;
        tamanho++;
    }

    // Remover um elemento da fila
    public int desenfileirar() {
        if (estaVazia()) {
            throw new IllegalStateException("A fila está vazia");
        }
        int valor = elementos[frente];
        frente = (frente + 1) % capacidade;
        tamanho--;
        return valor;
    }

    // Exibir o conteúdo da fila
    public void exibirFila() {
        if (estaVazia()) {
            System.out.println("A fila está vazia");
            return;
        }
        for (int i = 0; i < tamanho; i++) {
            int index = (frente + i) % capacidade;
            System.out.print(elementos[index] + " ");
        }
        System.out.println();
    }

    // Retornar o número de elementos na fila
    public int tamanho() {
        return tamanho;
    }

    // Verificar se um valor específico está na fila
    public boolean contem(int valor) {
        for (int i = 0; i < tamanho; i++) {
            int index = (frente + i) % capacidade;
            if (elementos[index] == valor) {
                return true;
            }
        }
        return false;
    }

    // Método auxiliar para verificar se a fila está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    public static void main(String[] args) {
        Fila fila = new Fila(5);
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
