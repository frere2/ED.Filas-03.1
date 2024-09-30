package view;

import br.edu.fateczl.fila.Fila;
import controller.TelefoneController;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) throws Exception {
        TelefoneController telefoneController = new TelefoneController();
        Fila<String> fila = new Fila<>();

        String[] options = {"Inserir chamada", "Ver histórico de chamadas", "Sair"};
        int escolha;

        do {
            escolha = JOptionPane.showOptionDialog(null, "Menu:",
                    "Sistema de Telefonia", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (escolha) {
                case 0:
                    String numero = JOptionPane.showInputDialog("Insira o número da chamada:");
                    if (numero != null && !numero.trim().isEmpty()) {
                        telefoneController.insereLigacao(fila, numero);
                    } else {
                        JOptionPane.showMessageDialog(null, "Número inválido!");
                    }
                    break;
                case 1:
                    telefoneController.consultaLigacoes(fila);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Encerrando sistema...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (escolha != 2);
    }
}
