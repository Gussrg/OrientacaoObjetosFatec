package src;
import src.ex4.Cliente;
import src.ex9.Transferencia;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicio 4\n");
        var cliente1 = new Cliente("João", 100, 1000);
        System.out.println(cliente1.obterNome());
        cliente1.sacar(2000);
        System.out.println(cliente1.checarSaldo());
        cliente1.sacar(100);
        System.out.println(cliente1.checarSaldo());
        cliente1.depositar(100);
        System.out.println(cliente1.checarSaldo());

        System.out.println("\nExercicio 9\n");
        var cliente2 = new Cliente("Maria", 800, 1000);

        System.out.println(cliente2.obterNome());
        System.out.println(cliente2.checarSaldo());
        System.out.println(cliente1.obterNome());
        System.out.println(cliente1.checarSaldo());

        var transferencia = new Transferencia(cliente1, cliente2, 400);

        System.out.println(cliente2.obterNome());
        System.out.println(cliente2.checarSaldo());
        System.out.println(cliente1.obterNome());
        System.out.println(cliente1.checarSaldo());

    }
}
