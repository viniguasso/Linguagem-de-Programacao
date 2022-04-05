// Solicitar ao usuário 2 números escolher uma das 4 operações artiméticas e calcular utilizando métodos
import javax.swing.JOptionPane;
public class OperaçãoAri {
    public static void main(String[] args) {
        float v1 = Float.parseFloat(solicitarValor("Digite o 1º valor: "));
        float v2 = Float.parseFloat(solicitarValor("Digite o 2º valor: "));
        char op = solicitarValor("Escolha a operação desejada\n Soma: (+)\n Subtração: (-)\n Multiplicação: (*)\n Divisão (/)"). charAt(0);
        calcular(v1, v2, op);
    }
    
    public static String solicitarValor(String solicitacao) {
        return JOptionPane.showInputDialog(solicitacao);
    }
    
    public static void calcular (float v1, float v2, char op) {
        float resultado = 0;
        switch(op) {
            case '+': {
                resultado = v1 + v2;
                break;
            }
            case '-': {
                resultado = v1 - v2;
                break;
            }
            case 'x': {
                resultado = v1 * v2;
                break;
            }
            case '/': {
                resultado = v1 / v2;
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null, "Operação Inválida");
                break;
            }
        }
        String resposta = v1 + " " + op + " " + v2 + " = " + resultado;
        JOptionPane.showInputDialog(null, resposta);
    }
}