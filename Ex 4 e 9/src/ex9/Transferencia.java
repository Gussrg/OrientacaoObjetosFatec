package src.ex9;

import src.ex4.Cliente;

public class Transferencia {
    
    private Cliente c1, c2;
    private double quantia;

    public Transferencia(Cliente c1, Cliente c2, double quantia) {
        this.c1 = c1;
        this.c2 = c2;
        this.quantia = quantia;

        if (c2.checarSaldo() < quantia){
            System.out.println("Saldo insuficiente");
            return;
        }

        c2.sacar(quantia);
        c1.depositar(quantia);

        System.out.println("Transferência realizada com sucesso\n" + 
            c2.obterNome() + ": R$"+ quantia + " -> " + c1.obterNome());
    }
    
}
