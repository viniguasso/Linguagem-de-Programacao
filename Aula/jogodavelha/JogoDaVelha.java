// Desenvolver, em Java, um jogo da velha em que o humano joga contra o cumputador
import javax.swing.JOptionPane;

public class JogoDaVelha {
    public static char tabuleiro[][] = new char[3][3];
    String tabuleiroGrafico = "";
    static boolean fimDeJogo = false;
    public static void main(String[] args) {
        String jogador = JOptionPane.showInputDialog("Digite seu nome: ");
        inicializarTabuleiro();
        while (!fimDeJogo) {
            jogarComputador();
            exibirTabuleiro();
            verificarVencedor(jogador);
            jogarHumano();
            exibirTabuleiro();
            verificarVencedor(jogador);
        }
    }

    public static void inicializarTabuleiro() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                tabuleiro[linha][coluna] = '?';
            }
        }
    }

    public static void exibirTabuleiro() {
        String tabuleiroGrafico = "";
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                tabuleiroGrafico = tabuleiroGrafico + tabuleiro[linha][coluna] + "    ";
            }
            tabuleiroGrafico = tabuleiroGrafico + "\n";
        }
        JOptionPane.showMessageDialog(null, tabuleiroGrafico);
    }

    public static void jogarComputador() {
        int linha = (int) (Math.random() * 3);
        int coluna = (int) (Math.random() * 3);
        if (tabuleiro[linha][coluna] == '?') {
            tabuleiro[linha][coluna] = 'X';
        } else {
            jogarComputador();
        }
    }

    public static void jogarHumano() {
        int linha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma linha"));
        int coluna = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma coluna"));
        if (tabuleiro[linha][coluna] == '?') {
            tabuleiro[linha][coluna] = 'O';
        } else {
            JOptionPane.showMessageDialog(null, "Jogada já realizada. Escolha outra posição");
            jogarHumano();
        }
    }

    public static void verificarVencedor(String jogador) {
        if ((tabuleiro[0][0] == tabuleiro[0][1]) && (tabuleiro[0][1] == tabuleiro[0][2]) && (tabuleiro[0][2] == 'X')) {
            JOptionPane.showMessageDialog(null, "Computador venceu");
            fimDeJogo = true;
        } 
        else if ((tabuleiro[1][0] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[1][2]) && (tabuleiro[1][2] == 'X')) {
            JOptionPane.showMessageDialog(null, "Computador venceu");
            fimDeJogo = true;
        } 
        else if ((tabuleiro[2][0] == tabuleiro[2][1]) && (tabuleiro[2][1] == tabuleiro[2][2]) && (tabuleiro[2][2] == 'X')) {
            JOptionPane.showMessageDialog(null, "Computador venceu");
            fimDeJogo = true;
        } 
        else if ((tabuleiro[0][0] == tabuleiro[1][0]) && (tabuleiro[1][0] == tabuleiro[2][0]) && (tabuleiro[2][0] == 'X')) {
            JOptionPane.showMessageDialog(null, "Computador venceu");
            fimDeJogo = true;
        } 
        else if ((tabuleiro[0][1] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[2][1]) && (tabuleiro[2][1] == 'X')) {
            JOptionPane.showMessageDialog(null, "Computador venceu");
            fimDeJogo = true;
        } 
        else if ((tabuleiro[0][2] == tabuleiro[1][2]) && (tabuleiro[1][2] == tabuleiro[2][2]) && (tabuleiro[2][2] == 'X')) {
            JOptionPane.showMessageDialog(null, "Computador venceu");
            fimDeJogo = true;
        } 
        else if ((tabuleiro[0][0] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[2][2]) && (tabuleiro[2][2] == 'X')) {
            JOptionPane.showMessageDialog(null, "Computador venceu");
            fimDeJogo = true;
        } 
        else if ((tabuleiro[0][2] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[2][0]) && (tabuleiro[2][0] == 'X')) {
            JOptionPane.showMessageDialog(null, "Computador venceu");
            fimDeJogo = true;
        }

        if ((tabuleiro[0][0] == tabuleiro[0][1]) && (tabuleiro[0][1] == tabuleiro[0][2]) && (tabuleiro[0][2] == 'O')) {
            JOptionPane.showMessageDialog(null, jogador + "venceu");
            fimDeJogo = true;
        } 
        else if ((tabuleiro[1][0] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[1][2]) && (tabuleiro[1][2] == 'O')) {
            JOptionPane.showMessageDialog(null, jogador + "venceu");
            fimDeJogo = true;
        } 
        else if ((tabuleiro[2][0] == tabuleiro[2][1]) && (tabuleiro[2][1] == tabuleiro[2][2]) && (tabuleiro[2][2] == 'O')) {
            JOptionPane.showMessageDialog(null, jogador + "venceu");
            fimDeJogo = true;
        }
        else if ((tabuleiro[0][0] == tabuleiro[1][0]) && (tabuleiro[1][0] == tabuleiro[2][0]) && (tabuleiro[2][0] == 'O')) {
            JOptionPane.showMessageDialog(null, jogador + "venceu");
            fimDeJogo = true;
        } 
        else if ((tabuleiro[0][1] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[2][1]) && (tabuleiro[2][1] == 'O')) {
            JOptionPane.showMessageDialog(null, jogador + "venceu");
            fimDeJogo = true;
        } 
        else if ((tabuleiro[0][2] == tabuleiro[1][2]) && (tabuleiro[1][2] == tabuleiro[2][2]) && (tabuleiro[2][2] == 'O')) {
            JOptionPane.showMessageDialog(null, jogador + "venceu");
            fimDeJogo = true;
        }
        else if ((tabuleiro[0][0] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[2][2]) && (tabuleiro[2][2] == 'O')) {
            JOptionPane.showMessageDialog(null, jogador + "venceu");
            fimDeJogo = true;
        } 
        else if ((tabuleiro[0][2] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[2][0]) && (tabuleiro[2][0] == 'O')) {
            JOptionPane.showMessageDialog(null, jogador + "venceu");
            fimDeJogo = true;
        }
    }
}