package questao6;

import questao3.Empregado;

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor() {
        super();
    }

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorVendas * (comissao / 100));
    }

    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Setor: " + getCodigoSetor());
        System.out.println("Salário Base: " + getSalarioBase());
        System.out.println("Imposto: " + getImposto());
        System.out.println("Valor Vendas: " + getValorVendas());
        System.out.println("Comissão: " + getComissao());
        System.out.println("Salário Líquido: " + calcularSalario());
    }
}