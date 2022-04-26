package Controller;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Arquivo {

    public void cadastrar(Criptomoeda criptomoeda, String nomeArquivo) {
        try {
            FileWriter fileWriter = new FileWriter(nomeArquivo, true);
            fileWriter.write(criptomoeda.getNome() + ";" + criptomoeda.getDescricao() + ";" + criptomoeda.getAnoLancamento() + "\n");
            fileWriter.close();
            JOptionPane.showMessageDialog(null, "A moeda"+ veiculo.getModelo() + " foi cadastrado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro");
        }
    }
    /*

    public String consultar(String nomeArquivo) {
        String conteudo="";
        try {
            File file = new File(nomeArquivo);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                conteudo += scanner.nextLine();
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Erro");
        }
        return conteudo;
    }
    */
}