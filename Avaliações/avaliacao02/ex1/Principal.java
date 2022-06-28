import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();

        System.out.println("Digite seu nome: ");
        pessoa1.setNome(entrada.next());
        System.out.println("Digite seu ano de nascimento: ");
        pessoa1.setAnoNasc(entrada.nextInt());
        System.out.println("Digite sua altura: ");
        pessoa1.setAltura(entrada.nextDouble());
        pessoa1.setIdade(2022);
    
        Pessoa pessoa2 = new Pessoa();

        System.out.println("Digite seu nome: ");
        pessoa2.setNome(entrada.next());
        System.out.println("Digite seu ano de nascimento: ");
        pessoa2.setAnoNasc(entrada.nextInt());
        System.out.println("Digite sua altura: ");
        pessoa2.setAltura(entrada.nextDouble());
        pessoa2.setIdade(2022);
    
        System.out.println("\nNome: " + pessoa1.getNome() + 
            "\nAno de nascimento: " + pessoa1.getAnoNasc()  + 
            "\nAltura: " + pessoa1.getAltura() + 
            "\nIdade: " + pessoa1.getIdade() + " anos.");

        System.out.println("\nNome: " + pessoa2.getNome() + 
            "\nAno de nascimento: " + pessoa2.getAnoNasc()  + 
            "\nAltura: " + pessoa2.getAltura() + 
            "\nIdade: " + pessoa2.getIdade() + " anos.");
    
        entrada.close();
        }
}