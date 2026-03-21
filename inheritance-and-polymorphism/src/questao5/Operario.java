package questao5;

import questao3.Empregado;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario() {
        super();
    }

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorProducao * (comissao / 100));
    }

    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Setor: " + getCodigoSetor());
        System.out.println("Salário Base: " + getSalarioBase());
        System.out.println("Imposto: " + getImposto());
        System.out.println("Valor Produção: " + getValorProducao());
        System.out.println("Comissão: " + getComissao());
        System.out.println("Salário Líquido: " + calcularSalario());
    }
}