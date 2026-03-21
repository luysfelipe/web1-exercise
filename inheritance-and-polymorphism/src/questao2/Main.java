package questao2;

public class Main {
    public static void main(String[] args){

        Fornecedor f1 = new Fornecedor("Joao", "rua a", "888", 1000, 100);

        f1.exibirDados();
        System.out.println("================");

        f1.setNome("Luis");
        f1.setTelefone("777");
        f1.setEndereco("rua b");
        f1.setValorCredito(1800);
        f1.setValorDivida(1000);

        f1.exibirDados();
    }
}