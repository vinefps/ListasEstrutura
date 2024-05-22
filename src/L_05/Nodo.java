package Lista_05;

public class Nodo {

    private int elemento;
    private Nodo proximo;
    private Nodo anterior;

    public Nodo (int elemento){
        this.elemento = elemento;
        this.proximo = null;
        this.anterior = null;
    }

    public Nodo (int elemento, Nodo proximo, Nodo anterior){
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
