package ADO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Digite uma expressão infixa:");
      String expressao = scanner.nextLine();

      ConversorInfixoParaPosfixo conversor = new ConversorInfixoParaPosfixo(expressao);
      System.out.println("Expressão Pós-Fixa: " + conversor.converter());

      scanner.close();
    }
}
