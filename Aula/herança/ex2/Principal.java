package ex2;
import javax.swing.JOptionPane;

public class Principal {

    public static String solicitarDados(String dado) {
        return JOptionPane.showInputDialog(dado);
    }

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.nome = solicitarDados("Digite seu nome: ");
        pessoa.idade = solicitarDados("Digite sua idade: ");
        pessoa.tipo = solicitarDados("Digite um tipo: ");
        
        System.out.println("Nome: " + pessoa.nome + 
			"\nIdade: " + pessoa.idade + 
			"\nTipo: " + pessoa.tipo
        );
        System.out.println("Esta pessoa: " + pessoa.Andar());
        System.out.println("Esta pessoa: " + pessoa.Falar());
    }
}