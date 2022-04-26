import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class Arquivo {
  public static void main(String[] args) {
    try {
      File myObj = new File("carros.txt");
      if (myObj.createNewFile()) {
        System.out.println("Arquivo criado: " + myObj.getName());
      } else {
        System.out.println("O arquivo ja existe.");
      }
    } catch (IOException e) {
      System.out.println("Ocorreu um erro.");
      e.printStackTrace();
    }
  }
}