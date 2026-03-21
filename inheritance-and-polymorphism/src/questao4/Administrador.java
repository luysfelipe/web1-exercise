package questao4;
import questao3.Empregado;

public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador() {
        super();
    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto){
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }

    public void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Setor: " + getCodigoSetor());
        System.out.println("Salário Base: " + getSalarioBase());
        System.out.println("Imposto: " + getImposto());
        System.out.println("Ajuda de custo: " + getAjudaDeCusto());
        System.out.println("Salário Líquido: " + calcularSalario());
    }
}
