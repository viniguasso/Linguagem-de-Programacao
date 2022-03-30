package introdução.exercicio2;
import javax.swing.JOptionPane;
public class OperacaoAri {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número");
        String operacao = JOptionPane.showInputDialog("Digite a operação: (+) (-) (x) (/) ");
        
        float v1 = Float.parseFloat(valor1);
        float v2 = Float.parseFloat(valor2);
        char op = operacao.charAt(0);
        
        switch(op) {
            case '+': {
                JOptionPane.showMessageDialog(null, v1 + " " + op + " " + v2 + " = " + (v1+v2));
                break;
            }
            case '-': {
                JOptionPane.showMessageDialog(null, v1 + " " + op + " " + v2 + " = " + (v1-v2));
                break;
            }
            case 'x': {
                JOptionPane.showMessageDialog(null, v1 + " " + op + " " + v2 + " = " + (v1*v2));
                break;
            }
            case '/': {
                JOptionPane.showMessageDialog(null, v1 + " " + op + " " + v2 + " = " + (v1/v2));
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null, "Seu animal");
                main(args);
                break;
            }
        }
    }
}