package questao1;

public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.nome = "Civic";
        carro1.peso = 1300;
        carro1.fabricante = "Honda";
        carro1.cor = "Preto";
        carro1.valor = 120000;

        System.out.println("Antes das alterações:");
        System.out.println("Cor: " + carro1.cor);
        System.out.println("Valor: " + carro1.valor);

        carro1.darDesconto(5000);
        carro1.pintar("Vermelho");

        System.out.println("\nDepois das alterações:");
        System.out.println("Cor: " + carro1.cor);
        System.out.println("Valor: " + carro1.valor);
    }
}