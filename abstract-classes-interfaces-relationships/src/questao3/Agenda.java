package questao3;

import java.util.ArrayList;

public class Agenda {

    private String nome;
    private ArrayList<Contato> contatos = new ArrayList<>();

    public Agenda(String nome) {
        this.nome = nome;
    }

    public void adicionarContato(Contato c) {
        contatos.add(c);
    }

    public String listarContatos() {
        String resultado = "";

        for (Contato c : contatos) {
            resultado += c.getInfo() + "\n";
        }

        return resultado;
    }
}