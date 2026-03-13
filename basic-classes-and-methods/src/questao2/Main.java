package questao2;

public class Main {

    public static void main(String[] args) {

        CartaoCredito cartao = new CartaoCredito();

        cartao.nomeCliente = "João";
        cartao.limite = 2000;
        cartao.saldoFatura = 0;

        cartao.realizaCompra(500);
        cartao.realizaCompra(700);
        cartao.realizaCompra(1000);

        cartao.imprimeFatura();
    }
}