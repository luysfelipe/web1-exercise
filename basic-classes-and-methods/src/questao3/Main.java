package questao3;

public class Main {

    public static void main(String[] args) {

        Elevador elevador = new Elevador();

        elevador.inicializa(5, 10);

        elevador.entra();
        elevador.entra();
        elevador.entra();

        elevador.sobe();
        elevador.sobe();

        elevador.sai();

        elevador.desce();

        System.out.println("Andar atual: " + elevador.getAndarAtual());
        System.out.println("Pessoas no elevador: " + elevador.getPessoas());
    }
}