import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Quadrado quadrado = new Quadrado();
        Circulo circulo = new Circulo();

        System.out.println("Digite o lado do quadrado:");
        quadrado.setLado(Float.parseFloat(scanner.nextLine()));
        System.out.println("Digite o raio do círculo: ");
        circulo.setRaio(Float.parseFloat(scanner.nextLine()));

        System.out.println("Área do quadrado: " + quadrado.calcularArea() + "\n" + "Perímetro do quadrado: "
                + quadrado.calcularPerimetro() + "\n");

        System.out.println("Área do círculo: " + circulo.calcularArea() + "\n" + "Perímetro do círculo: "
                + circulo.calcularPerimetro());
    }
}