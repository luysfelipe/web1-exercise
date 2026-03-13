package questao2;

public class CartaoCredito {

    double limite;
    double saldoFatura;
    String nomeCliente;

    public void aumentaLimite(double valor) {
        limite = limite + valor;
    }

    public void diminuiLimite(double valor) {
        limite = limite - valor;
    }

    public void realizaCompra(double valorCompra) {

        if (saldoFatura + valorCompra <= limite) {
            saldoFatura = saldoFatura + valorCompra;
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Compra não permitida! Limite atingido.");
        }

    }

    public void imprimeFatura() {
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Valor da fatura: " + saldoFatura);
    }
}