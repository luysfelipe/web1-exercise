package questao1;

public class Main {
    public static void main(String[] args){

        Pessoa p1 = new Pessoa();
        p1.setNome("João");
        System.out.println(p1.getNome());

        Pessoa p2 = new Pessoa("Maria");
        System.out.println(p2.getNome());

        Pessoa p3 = new Pessoa("Carlos", "Rua B", "8888");
        System.out.println(p3.getNome());
        System.out.println(p3.getEndereco());
        System.out.println(p3.getTelefone());
    }
}