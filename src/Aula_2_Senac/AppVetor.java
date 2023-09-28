package Aula_2_Senac;

public class AppVetor // Classe AppVetor
{
    public static void main(String[] args) 
    {
        int tamanho = 100; // tamanho do vetor
        Vetor arr = new Vetor(tamanho); // cria o vetor com o tamanho especificado

        arr.inserir(77); // insere 10 itens
        arr.inserir(99);
        arr.inserir(44);
        arr.inserir(55);
        arr.inserir(22);
        arr.inserir(88);
        arr.display();  // exibe os itens

        if (arr.procurar(35)) // procura o item 35
            System.out.println("Achou " + 35);
        else // não achou o item 35
            System.out.println("O valor " + 35+" nao foi cadastrado");

        arr.remover(55); // remove os itens 55 e 99

        arr.display(); // exibe os itens novamente
    }
}