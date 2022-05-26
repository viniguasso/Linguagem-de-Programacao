package ex1;
import javax.swing.JOptionPane;

public class Usuario {

    protected static String nome;
    protected static String email;
    protected static String telefone;

    public static String solicitarDados(String dado) {
        return JOptionPane.showInputDialog(dado);
    }
}