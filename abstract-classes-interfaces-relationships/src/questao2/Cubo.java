package questao2;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {

    private double lado;

    public Cubo(String nome, String cor, double lado) {
        super(nome, cor);
        this.lado = lado;
    }

    public double calcularArea() {
        return 6 * lado * lado;
    }

    public double calcularVolume() {
        return lado * lado * lado;
    }
}