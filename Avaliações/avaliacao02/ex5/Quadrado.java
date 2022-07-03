public class Quadrado implements FormaGeometrica {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return getLado() * getLado();
    }

    @Override
    public double calcularPerimetro() {
        return 4 * getLado();
    }
}