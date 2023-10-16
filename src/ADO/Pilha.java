package ADO;

public class Pilha 
{
    int topo;
    int capacidade;
    char[] array;

    public Pilha(int capacidade) {
        topo = -1;
        this.capacidade = capacidade;
        array = new char[capacidade];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public void push(char x) { array[++topo] = x; }

    public char pop() {
        if (!isEmpty()) {
            return array[topo--];
        }
        return '$';
    }

    public char peek() {
        if (!isEmpty()) {
            return array[topo];
        }
        return '$';
    }
}
