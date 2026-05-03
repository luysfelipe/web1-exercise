package questao4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno[] alunos = new Aluno[5];

        double somaTurma = 0;

        for (int i = 0; i < 5; i++) {

            alunos[i] = new Aluno("Aluno" + i, "" + i);

            System.out.println("Aluno " + (i + 1));

            for (int j = 0; j < 4; j++) {
                System.out.print("Nota: ");
                alunos[i].setNota(j, sc.nextDouble());
            }
        }

        for (Aluno a : alunos) {

            double media = a.calcularMedia();
            somaTurma += media;

            System.out.println("Média: " + media);
            System.out.println(media >= 7 ? "Aprovado" : "Reprovado");
        }

        System.out.println("Média da turma: " + somaTurma / 5);
    }
}