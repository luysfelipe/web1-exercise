package questao1;

public abstract class Funcionario {

    private String nome;
    private String matricula;
    protected double salarioBase;

    public Funcionario(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public abstract double calculaSalario();
}