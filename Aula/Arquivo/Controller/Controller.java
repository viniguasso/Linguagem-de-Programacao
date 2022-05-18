package Controller;

import javax.swing.JOptionPane;

import Persistence.Storage;

public class Controller {
    public static void main(String[] args) {

        String opcao;
        StringBuffer menu = new StringBuffer();
        menu.append("1 - Popular lista de glicemia\n");
        menu.append("2 - Exibir lista de glicemia\n");
        menu.append("7 - Sair");
        do {
            opcao = JOptionPane.showInputDialog(null, menu);

            switch (opcao) {
                case "1" : //popular
                    Storage.popularListaDoArquivo(Arquivo.dadosGlicemia);
                    break;
                case "2" : //exibir
                    break;
                case "7" : JOptionPane.showMessageDialog(null, "Obrigado por usar o sistema");
                default : JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

            if (opcao.equals("7")) break;
        } while (true);
    }
}
