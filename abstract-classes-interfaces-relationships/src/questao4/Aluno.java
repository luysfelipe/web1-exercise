package questao4;

public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas = new double[4];

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void setNota(int i, double nota) {
        notas[i] = nota;
    }

    public double calcularMedia() {
        double soma = 0;

        for (double n : notas) {
            soma += n;
        }

        return soma / 4;
    }
}