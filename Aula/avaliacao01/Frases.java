import javax.swing.JOptionPane;
public class Frases {

    public static String solicitarFrase(String frase) {
        return JOptionPane.showInputDialog(frase);
    }
    public static void cortarFrase(String frase, int tamanho) {
        int ponto = Integer.parseInt(JOptionPane.showInputDialog("Sua frase contém "+ tamanho +" carácteres.\nDigite o ponto inicial da extração da frase: "));
        JOptionPane.showMessageDialog(null, "A sua frase extraída a partir do "+ ponto +"º caráctere: "+ frase.substring(ponto, tamanho));
    }
    public static void gerarCaractere(String frase, int tamanho) {
        int caractere = (int) (Math.random() * tamanho);
        JOptionPane.showMessageDialog(null, "Número aleatório gerado pelo Computador: "+ caractere);
        JOptionPane.showMessageDialog(null, "O caráctere extraída da "+ caractere +"º posição: "+ frase.charAt(caractere));
    }

    public static void main (String[] args) {
        String frase = solicitarFrase("Digite sua frase: ");
        int tamanho = frase.length();
        cortarFrase(frase, tamanho);
        gerarCaractere(frase, tamanho);
    }
}
