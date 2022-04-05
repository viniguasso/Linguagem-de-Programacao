import javax.swing.JOptionPane;
public class Frases {
    public static String solicitarFrase(String frase) {
        return JOptionPane.showInputDialog(frase);
    }
    public static void cortarFrase(String frase, int tamanho) {
        int ponto = Integer.parseInt(JOptionPane.showInputDialog("Sua frase contém "+ tamanho +" carácteres.\nDigite o ponto inicial da extração da frase: "));
        JOptionPane.showMessageDialog(null, "A sua frase extraída a partir do "+ ponto +"º caráctere: "+ frase.substring(ponto, tamanho));
    }
    public static void gerarMostrarCaractere(String frase, int tamanho) {
        int caractere = (int) (Math.random() * tamanho + 1);
        JOptionPane.showMessageDialog(null, "Posição aleatória gerada pelo Computador: "+ caractere +"º");
        JOptionPane.showMessageDialog(null, "O caráctere extraído da "+ caractere +"º posição: "+ frase.charAt(caractere - 1));
    }
    public static void main (String[] args) {
        String frase = solicitarFrase("Digite sua frase: ");
        int tamanho = frase.length();
        cortarFrase(frase, tamanho);
        gerarMostrarCaractere(frase, tamanho);
    }
}