package ex3;

import javax.swing.JOptionPane;
public class Principal {
    
    public static String solicitarDados(String dado) {
        return JOptionPane.showInputDialog(dado);
    }
    
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        Funcionario f3 = new Funcionario();
        f1.nome = solicitarDados("Digite seu nome: ");
        f1.idade = solicitarDados("Digite sua idade: ");
        f1.telefone = solicitarDados("Digite seu telefone: ");
        f1.setor = solicitarDados("Digite seu setor: ");
        f1.cargo = solicitarDados("Digite seu cargo: ");
        f1.funcao = solicitarDados("Digite seu função: ");
        f2.nome = solicitarDados("Digite seu nome: ");
        f2.idade = solicitarDados("Digite sua idade: ");
        f2.telefone = solicitarDados("Digite seu telefone: ");
        f2.setor = solicitarDados("Digite seu setor: ");
        f2.cargo = solicitarDados("Digite seu cargo: ");
        f2.funcao = solicitarDados("Digite seu função: ");       
        f3.nome = solicitarDados("Digite seu nome: ");
        f3.idade = solicitarDados("Digite sua idade: ");
        f3.telefone = solicitarDados("Digite seu telefone: ");
        f3.setor = solicitarDados("Digite seu setor: ");
        f3.cargo = solicitarDados("Digite seu cargo: ");
        f3.funcao = solicitarDados("Digite seu função: ");      
        JOptionPane.showMessageDialog(null, "Funcionário 1:" +
                "\nNome: " + f1.nome + 
                "\nIdade: " + f1.idade + 
                "\nTelefone: " + f1.telefone + 
                "\nSetor: " + f1.setor +
                "\nCargo: " + f1.cargo + 
                "\nFunção: " + f1.funcao);       
        JOptionPane.showMessageDialog(null, "Funcionário 2:" +
                "\nNome: " + f2.nome + 
                "\nIdade: " + f2.idade + 
                "\nTelefone: " + f2.telefone + 
                "\nSetor: " + f2.setor +
                "\nCargo: " + f2.cargo + 
                "\nFunção: " + f2.funcao);  
        JOptionPane.showMessageDialog(null, "Funcionário 3:" +
                "\nNome: " + f3.nome + 
                "\nIdade: " + f3.idade + 
                "\nTelefone: " + f3.telefone + 
                "\nSetor: " + f3.setor +
                "\nCargo: " + f3.cargo + 
                "\nFunção: " + f3.funcao);
    }
}
