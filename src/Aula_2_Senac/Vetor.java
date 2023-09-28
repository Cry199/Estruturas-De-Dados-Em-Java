package Aula_2_Senac; // Pacote

// Classe Vetor
public class Vetor 
{
    private int[] elementos; // array de elementos
    private int quantidade; // número de elementos

    // Construtor
    public Vetor(int tamanho) 
    {
        elementos = new int[tamanho]; // cria o array
        quantidade = 0; // inicializa a quantidade
    }

    // Métodos
    public boolean procurar(int valor) 
    {
        int i; // contador
        for (i = 0; i < quantidade; i++) // procura o valor
            if (elementos[i] == valor) // se o valor for encontrado
                break;

        if (i == quantidade) // se o valor não for encontrado
            return false; 
        else // se o valor for encontrado
            return true;
    }

    // Inserção e remoção
    public void inserir(int valor) 
    {
        elementos[quantidade] = valor; // insere o valor no final do array
        quantidade++; // incrementa a quantidade
    }

    // Remoção
    public boolean remover(int valor) 
    {
        int i; // contador  
        for (i = 0; i < quantidade; i++) // procura o valor
            if (valor == elementos[i]) // se o valor for encontrado
                break;

        if (i == quantidade) // se o valor não for encontrado
            return false;
        else // se o valor for encontrado
        {
            for (int j = i; j < quantidade; j++)
                elementos[j] = elementos[j + 1];

            quantidade--;
            return true;
        }
    }

    // Exibição
    public void display() 
    {
        for (int i = 0; i < quantidade; i++) // exibe os elementos
            System.out.print(elementos[i] + " "); // exibe o elemento

        System.out.println(""); // 
    }
}