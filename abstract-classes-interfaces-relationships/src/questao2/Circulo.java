package questao2;

public class Circulo extends Figura2D implements DimensaoSuperficial {

    private double raio;

    public Circulo(String nome, String cor, double raio) {
        super(nome, cor);
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}