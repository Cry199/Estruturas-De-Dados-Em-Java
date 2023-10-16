package ADO;

public class ConversorInfixoParaPosfixo 
{
    private String expressaoInfixa;
    private String saida = "";
    private Pilha pilha;

    public ConversorInfixoParaPosfixo(String expressaoInfixa) 
    {
        this.expressaoInfixa = expressaoInfixa;
        this.pilha = new Pilha(expressaoInfixa.length());
    }

    private boolean ehOperador(char ch) 
    {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    private int obterPrecedencia(char ch) 
    {
        switch (ch) 
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }

        return -1;
    }

    public String converter() 
    {
        for (int i = 0; i < expressaoInfixa.length(); i++) 
        {
            char c = expressaoInfixa.charAt(i);

            if (!ehOperador(c)) 
            {
                saida += c;
            } 
            else if (c == '(') 
            {
                pilha.push(c);
            } 
            else if (c == ')') 
            {
                while (!pilha.isEmpty() && pilha.peek() != '(') 
                {
                    saida += pilha.pop();
                }
                if (!pilha.isEmpty() && pilha.peek() != '(') 
                {
                    return "Expressão inválida";
                } 
                else 
                {
                    pilha.pop();
                }
            } 
            else 
            { 
                if (pilha.isEmpty()) 
                {
                    pilha.push(c);
                } 
                else 
                {
                    while (!pilha.isEmpty() && obterPrecedencia(c) <= obterPrecedencia(pilha.peek())) 
                    {
                        saida += pilha.pop();
                    }

                    pilha.push(c);
                }
            }
        }

        while (!pilha.isEmpty()) 
        {
            saida += pilha.pop();
        }

        return saida;
    }

}