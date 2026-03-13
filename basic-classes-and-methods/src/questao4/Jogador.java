package questao4;

import java.time.LocalDate;

public class Jogador {

    private String nome;
    private String posicao;
    private int anoNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int calcularIdade() {
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - anoNascimento;
    }

    public void tempoParaAposentar() {

        int idade = calcularIdade();
        int idadeAposentadoria = 0;

        if (posicao.equalsIgnoreCase("defesa")) {
            idadeAposentadoria = 40;
        } else if (posicao.equalsIgnoreCase("meio-campo")) {
            idadeAposentadoria = 38;
        } else if (posicao.equalsIgnoreCase("atacante")) {
            idadeAposentadoria = 35;
        }

        int tempo = idadeAposentadoria - idade;

        if (tempo > 0) {
            System.out.println("Faltam " + tempo + " anos para se aposentar.");
        } else {
            System.out.println("O jogador já pode se aposentar.");
        }
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Posição: " + posicao);
        System.out.println("Nascimento: " + anoNascimento);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Idade: " + calcularIdade());
    }
}