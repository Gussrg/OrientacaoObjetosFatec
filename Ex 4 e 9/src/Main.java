import ex4.Cliente;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicio 4");
        var cliente = new Cliente("João", 100, 1000);
        System.out.println(cliente.obterNome());
        cliente.sacar(2000);
        System.out.println(cliente.checarSaldo());
        cliente.sacar(100);
        System.out.println(cliente.checarSaldo());
        cliente.depositar(100);
        System.out.println(cliente.checarSaldo());
    }
}
