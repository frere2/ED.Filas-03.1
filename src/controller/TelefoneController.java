package controller;

import br.edu.fateczl.fila.Fila;

public class TelefoneController {
    public void insereLigacao(Fila<String> f, String numeroTelefone) {
        System.out.println("Ligando para " + numeroTelefone);
        f.insert(numeroTelefone);
    }

    public void consultaLigacoes(Fila<String> f) {
        try {
            while (!f.isEmpty()) {
                System.out.println("Ligação para " + f.remove());
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar ligações.");
        }
    }
}
