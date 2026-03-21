package questao6;

public class Main {
    public static void main(String[] args){

        Vendedor v1 = new Vendedor("Joao", "rua a", "888", 1, 2000, 10, 6000, 5);

        v1.exibirDados();

        System.out.println("================");

        v1.setNome("Luis");
        v1.setTelefone("777");
        v1.setEndereco("rua b");
        v1.setCodigoSetor(2);
        v1.setSalarioBase(3000);
        v1.setImposto(15);
        v1.setValorVendas(9000);
        v1.setComissao(10);

        v1.exibirDados();
    }
}