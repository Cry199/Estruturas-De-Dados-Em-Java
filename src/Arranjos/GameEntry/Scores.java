package Arranjos.GameEntry;

public class Scores // Armazena uma lista de pontuações altas em ordem decrescente
{
    public static final int maxEntries = 10; // número máximo de entradas
    protected int numEntries; // número de entradas
    protected GameEntry[] entries; // array de entradas (nomes e pontuações)
    
    /** Construtor **/
    public Scores()
    {
        entries = new GameEntry[maxEntries]; // cria array de entradas
        numEntries = 0; // inicialmente não há entradas
    }

    /** Retorna uma representação string da lista de escores **/
    public String toString()
    {
        String s = "[";
        for (int i = 0; i < numEntries; i++) // concatena as representações string das entradas
        {
            if (i > 0) s += ", "; // separador entre entradas
            s += entries[i]; // concatena a representação string da entrada
        }
        return s + "]"; // concatena a representação string completa
    }

    // ... Os metodos para atualizar o conjunto de escores vão aqui ...

    // Inserção de um novo escore na lista de escores

    /** Tenda inserir um novo escore na coleção (se ele for grnade o suficiente) **/
    public void add(GameEntry e)
    {
        int newScore = e.getScore(); // pontuação a ser adicionada

        // é esse um escore bom o suficiente para entrar na lista?
        if (numEntries == maxEntries) // o array está cheio
        {
            if (newScore <= entries[numEntries - 1].getScore()) // não, o novo escore não é bom o suficiente
            return; // não, o novo escore não é bom o suficiente
        }
        else // o array não está cheio
        numEntries++; // aumenta o número de entradas

        // localiza o lugar onde o novo escore deve ser inserido
        int i = numEntries - 1; // começa no último elemento

        for (; (i >= 1) && (newScore > entries[i - 1].getScore()); i--) // desloca as entradas menores para baixo
        entries[i] = entries[i - 1]; // desloca as entradas menores para cima
        entries[i] = e; // adiciona o novo escore na posição correta
    } 

    // Remove De Objetos

    /** Remove e retorna o escore armazenado no índice i **/
    public GameEntry remove(int i) throws IndexOutOfBoundsException
    {
        if ((i < 0) || (i >= numEntries)) // índice inválido?
        throw new IndexOutOfBoundsException("Índice inválido: " + i); // sim, lança a exceção

        GameEntry temp = entries[i]; // guarda o escore a ser removido

        for (int j = i; j < numEntries - 1; j++) // desloca os escores maiores para baixo
        entries[j] = entries[j + 1];    // desloca os escores maiores para baixo
        entries[numEntries - 1] = null; // null para limpar a referência
        numEntries--; // decrementa o número de entradas

        return temp; // retorna o escore removido
    }
}
