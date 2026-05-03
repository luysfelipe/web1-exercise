package questao1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Funcionario> lista = new ArrayList<>();

        lista.add(new Gerente("Ana", "1", 5000));
        lista.add(new Assistente("João", "2", 2000));
        lista.add(new Vendedor("Carlos", "3", 1500, 500));

        double total = 0;

        for (Funcionario f : lista) {
            total += f.calculaSalario();
        }

        System.out.println("Folha salarial total: " + total);
    }
}