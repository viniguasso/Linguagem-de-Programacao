import javax.swing.JOptionPane;
public class Classes {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        //String idade = "10";
        //int i = Integer.parseInt(idade); //"10" -> 10
        String idade = JOptionPane.showInputDialog("Digite sua idade");
        //int idade2 = Integer.parseInt(idade);
        //int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade");
        JOptionPane.showInputDialog(null, "Nome: " + nome + "\n" + "Idade: " + idade);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}