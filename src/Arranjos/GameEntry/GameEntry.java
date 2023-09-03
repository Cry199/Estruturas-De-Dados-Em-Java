package Arranjos.GameEntry;

public class GameEntry // Representa uma entrada de um jogo 
{
    protected String name; // nome do jogador
    protected int score;  // pontuação do jogo

    /** Contrutor que Cria um registro do jogo **/
    public GameEntry(String n, int s)
    {
        name = n; ;
        score = s; // configura o nome e a pontuação
    }

    /** Retorna o nome do jogador **/
    public String getName(){ return name; }

    /** Retorna a pontuação do jogador **/
    public int getScore(){ return score; }

    /** Retorna uma representação String do registro **/
    public String toString()
    {
        return "(" + name + ", " + score + ")"; // (nome, pontuação)
    }
}
