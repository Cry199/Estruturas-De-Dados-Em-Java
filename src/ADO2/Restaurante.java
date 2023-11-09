package ADO2;

import java.util.Scanner;

public class Restaurante {
    private Fila filaComum = new Fila();
    private Fila filaVip = new Fila();

    public void adicionarFila(Cliente cliente) {
        if (cliente.isVip()) {
            filaVip.enfileirar(cliente);
        } else {
            filaComum.enfileirar(cliente);
        }
    }

    public Cliente chamarProximoCliente() {
        if (filaVip.frente != null) {
            return filaVip.desenfileirar().cliente;
        } else if (filaComum.frente != null) {
            return filaComum.desenfileirar().cliente;
        } else {
            return null;
        }
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Adicionar cliente");
            System.out.println("2. Chamar próximo cliente");
            System.out.println("3. Sair");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente:");
                    String nome = scanner.next();
                    System.out.println("O cliente é VIP? (true/false)");
                    boolean isVip = scanner.nextBoolean();
                    adicionarFila(new Cliente(nome, isVip));
                    break;
                case 2:
                    Cliente proximoCliente = chamarProximoCliente();
                    if (proximoCliente != null) {
                        System.out.println("O próximo cliente a ser chamado é: " + proximoCliente.getNome());
                    } else {
                        System.out.println("Não há clientes na fila.");
                    }
                    break;
                case 3:
                    return;
            }
        }
    }
}