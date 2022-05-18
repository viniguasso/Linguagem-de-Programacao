public class Principal {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Vinicius";
        pessoa1.idade = 20; 

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Mauricio";
        pessoa2.idade = 19; 

        Pessoa pessoa3 = new Pessoa();
        pessoa3.nome = "Bernardo";
        pessoa3.idade = 21; 

        System.out.println("A idade da pessoa1 é: " + pessoa1.idade);
        System.out.println("A idade da pessoa2 é: " + pessoa2.idade);
        System.out.println("A idade da pessoa3 é: " + pessoa3.idade);
    }
    
}
