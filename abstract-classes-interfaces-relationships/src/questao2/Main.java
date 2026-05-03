package questao2;

public class Main {

    public static void main(String[] args) {

        FiguraGeometrica[] figuras = {
                new Circulo("Circulo", "Azul", 2),
                new Cubo("Cubo", "Vermelho", 3)
        };

        for (FiguraGeometrica f : figuras) {

            if (f instanceof DimensaoSuperficial) {
                System.out.println("Área: " +
                        ((DimensaoSuperficial) f).calcularArea());
            }

            if (f instanceof DimensaoVolumetrica) {
                System.out.println("Volume: " +
                        ((DimensaoVolumetrica) f).calcularVolume());
            }
        }
    }
}