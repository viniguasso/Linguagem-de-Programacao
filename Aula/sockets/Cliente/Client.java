package Cliente;

import java.io.ObjectInputStream;
import java.net.Socket;
import java.sql.Date;
import javax.swing.JOptionPane;

public class Client {
    
    public static void main(String[] args) {
        try {
            Socket cliente = new Socket("172.25.1.14", 12345);
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            Date data_atual = (Date) entrada.readObject();
            JOptionPane.showMessageDialog(null, "Data recebida do servidor: " + data_atual.toString());
            entrada.close();
            System.out.println("Conexão encerrada");
            cliente.close();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}