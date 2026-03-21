package questao2;
import questao1.Pessoa;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(){}

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida){
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Credito: " + valorCredito);
        System.out.println("Divida: " + valorDivida);
        System.out.println("Saldo: " + obterSaldo());
    }
}
