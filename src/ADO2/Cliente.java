package ADO2;

public class Cliente {
    private String nome;
    private boolean isVip;

    public Cliente(String nome, boolean isVip) {
        this.nome = nome;
        this.isVip = isVip;
    }

    public String getNome() {
        return nome;
    }

    public boolean isVip() {
        return isVip;
    }
}