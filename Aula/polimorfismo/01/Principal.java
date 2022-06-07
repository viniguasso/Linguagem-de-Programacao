import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {

        Soma soma = new Soma();
        soma.calcular(2, 3);
        soma.exibeResultado();
        Multiplicacao multiplicacao = new Multiplicacao();
        multiplicacao.calcular(2, 3);
        multiplicacao.exibeResultado();
        
        System.out.println("Retorno da soma, sobrecarga: " + soma.calcular(2));
        soma.exibeResultado();
        soma.calcular(2, 3);
        soma.exibeResultado();

        int valor1 = solicitarValor("Digite o primeiro valor: ");
        int valor2 = solicitarValor("Digite o segundo valor: ");
    }
    
    public static int solicitarValor(String valor1) {
        return JOptionPane.showInputDialog();
    }
}