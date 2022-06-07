package ex02;

import java.util.Scanner;
//import java.io.FileWriter;
//import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserDados dados = new UserDados();

        Arquivo arquivo = new Arquivo();

        System.out.println("Informe o nome: ");
        dados.setNome(scanner.nextLine());

        System.out.println("Informe o email: ");
        dados.setEmail(scanner.nextLine());

        if(!dados.getNome().isEmpty() && !dados.getEmail().isEmpty()) {
            arquivo.criacaoArq(dados.getNome(), dados.getEmail());
        }

        else if(!dados.getNome().isEmpty() && dados.getEmail().isEmpty()) {
            arquivo.criacaoArq(dados.getNome());
        }
        else {
            System.out.println("Dados incompletos");
        } 
        scanner.close();
    }
}
