public class Cliente {

    private String nome, cpf;
    private Telefone telefone;

    public Cliente(String nome, String cpf, Telefone telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone.obterDDD() + " " + telefone.obterNumero());
    }

    public void adicionarTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

}
