package ex1;

public class Principal extends Usuario {

    public static void main(String[] args) {
        
        nome = solicitarDados("Digite seu nome: ");
        email = solicitarDados("Digite seu e-mail: ");
        telefone = solicitarDados("Digite seu telefone: ");
        
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
    }
}