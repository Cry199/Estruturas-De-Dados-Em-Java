package Arranjos.GameEntry;

import java.util.Scanner;

public class GameEntryMain {

    static Scanner sc = new Scanner(System.in);
    static Scores score = new Scores();
    static GameEntry removedScore;
    
    public static void main(String[] args) throws Exception 
    {
        init();
    }

    private static void init()
    {
        int opcao = 0;
        do
        {
            menu();
            opcao = sc.nextInt();
            switch(opcao)
            {
                case 1:
                    inserir();
                    break;
                case 2:
                    remover();
                    break;
                case 3:
                    listar();
                    break;
                case 4:
                    sair();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 4);
    }

    private static void menu()
    {
        System.out.println("1 - Inserir");
        System.out.println("2 - Remover");
        System.out.println("3 - Listar");
        System.out.println("4 - Sair");
    }

    private static void inserir()
    {
        sc.nextLine();

        System.out.println("Digite o nome do jogador: ");
        String nome = sc.nextLine();

        System.out.println("Digite a pontuação do jogador: ");
        int pontuacao = sc.nextInt();

        score.add(new GameEntry(nome, pontuacao));
    }

    private static void remover()
    {
        System.out.println("Digite o index para remover: ");
        int i = sc.nextInt();

        removedScore = score.remove(i);
        System.out.println("Entrada removida: " + removedScore);
    }

    private static void listar()
    {
        System.out.println(score.toString());
    }

    private static void sair()
    {
       System.out.println("Saindo..."); 
    }
}
