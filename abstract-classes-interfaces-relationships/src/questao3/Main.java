package questao3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome da agenda: ");
        Agenda agenda = new Agenda(sc.nextLine());

        for (int i = 0; i < 3; i++) {

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Telefone: ");
            String telefone = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            agenda.adicionarContato(new Contato(nome, telefone, email));
        }

        System.out.println("\nContatos:");
        System.out.println(agenda.listarContatos());
    }
}