import Controller.Arquivo;

/*
É a classe Principal, orientada a objetos
 */
public class Principal {
    
    public static void main(String[] args) {
        Solicitar solicitar = new Solicitar();       
        Carro carro = new Carro();
        new Arquivo();

        solicitar.inputStr(carro.getMarca());
    }

    
}
