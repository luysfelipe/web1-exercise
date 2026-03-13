package questao1;

public class Carro {

    String nome;
    double peso;
    String fabricante;
    String cor;
    double valor;

    public void darDesconto(double desconto) {
        valor = valor - desconto;
    }

    public void pintar(String novaCor) {
        cor = novaCor;
    }
}