package questao5;

public class Main {
    public static void main(String[] args){

        Operario o1 = new Operario("Joao", "rua a", "888", 1, 2000, 10, 5000, 5);

        o1.exibirDados();

        System.out.println("================");

        o1.setNome("Luis");
        o1.setTelefone("777");
        o1.setEndereco("rua b");
        o1.setCodigoSetor(2);
        o1.setSalarioBase(3000);
        o1.setImposto(15);
        o1.setValorProducao(8000);
        o1.setComissao(10);

        o1.exibirDados();
    }
}