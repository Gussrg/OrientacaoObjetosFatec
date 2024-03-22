package src.ex4;

public class Cliente {

    private String nome;
    private double saldo;
    private double limite;

    public Cliente(String nome, double saldo, double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void sacar(double valor) {
        if (valor > (this.saldo + this.limite)) {
            System.out.println("Saldo insuficiente");
            return;
        }
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public double checarSaldo() {
        return this.saldo + this.limite;
    }

    public String obterNome() {
        return this.nome;
    }

}
