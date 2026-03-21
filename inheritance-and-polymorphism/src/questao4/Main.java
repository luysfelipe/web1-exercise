package questao4;

public class Main {
    public static void main(String[] args){

        Administrador A1 = new Administrador("Joao", "rua a", "888", 1, 2000, 1, 200);

        A1.exibirDados();

        System.out.println("================");

        A1.setNome("Luis");
        A1.setTelefone("777");
        A1.setEndereco("rua b");
        A1.setCodigoSetor(2);
        A1.setSalarioBase(3000);
        A1.setImposto(15);
        A1.setAjudaDeCusto(10);

        A1.exibirDados();
    }
}