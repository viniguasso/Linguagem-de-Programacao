// Criar uma classe, em Java, para solicitar o nome, idade, e o genêro (M ou F) de uma pessoa e apresentar esses dados na tela.
// Adicionalmente informe a idade mínima de aposentadoria para essa pessoa.
package métodos.exercicio2;
import javax.swing.JOptionPane;
public class Aposentaria {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        int idade = Integer.parseInt(solicitarDados("Digite sua idade: "));
        char genero = solicitarDados("Gênero\n\n Masculino: (m)\n Feminino: (f)"). charAt(0);
        int resultado = calcular(idade, genero);
        mostrarDados(nome, idade, genero, resultado);
    }
    
    public static String solicitarDados(String solicitacao) {
        return JOptionPane.showInputDialog(solicitacao);
    }
    
    public static int calcular (int idade, char genero) {
        int resultado = 0;
        switch(genero) {
            case 'm': {
                resultado = 65 - idade;
                break;
            }
            case 'f': {
                resultado = 57 - idade;
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null, "Gênero Inválido");
                break;
            }
        }
        return resultado;
    }
    
    public static void mostrarDados(String nome, int idade, char genero, int resultado) {
        String resposta = "Nome: " + nome + 
            "\nIdade: " + idade + 
            "\nGenêro: " + genero + 
            "\nFaltam " + resultado + " anos para você se aposentar";
        JOptionPane.showMessageDialog(null, resposta);
    }
}