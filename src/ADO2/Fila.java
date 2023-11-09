package ADO2;

public class Fila {
    Nodo frente;
    Nodo tras;

    public Fila() {
        this.frente = this.tras = null;
    }

    public void enfileirar(Cliente cliente) {
        Nodo novoNodo = new Nodo(cliente);

        if(this.tras == null) {
            this.frente = this.tras = novoNodo;
            return;
        }

        this.tras.proximo = novoNodo;
        this.tras = novoNodo;
    }

    public Nodo desenfileirar() {
        if(this.frente == null)
            return null;

        Nodo temp = this.frente;
        this.frente = this.frente.proximo;

        if(this.frente == null)
            this.tras = null;

        return temp;
    }
}