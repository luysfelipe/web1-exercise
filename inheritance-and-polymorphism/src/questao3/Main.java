package questao3;

public class Main {
    public static void main(String[] args){

        Empregado e1 = new Empregado("Joao", "rua a", "888", 1, 2000, 1);

        e1.exibirDados();

        System.out.println("================");

        e1.setNome("Luis");
        e1.setTelefone("777");
        e1.setEndereco("rua b");
        e1.setCodigoSetor(2);
        e1.setSalarioBase(3000);
        e1.setImposto(15);

        e1.exibirDados();
    }
}