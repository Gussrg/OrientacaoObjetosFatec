public class Main {
    public static void main(String[] args) {
        Telefone telefone = new Telefone("11", "999999999");
        Cliente cliente = new Cliente("Fulano", "123456789", telefone);
        cliente.mostrarDados();
        cliente.adicionarTelefone(new Telefone("11", "888888888"));
        cliente.mostrarDados();
    }
}
