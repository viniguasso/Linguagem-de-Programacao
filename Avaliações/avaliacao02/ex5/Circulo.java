public class Circulo implements FormaGeometrica {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * (getRaio() * getRaio());
    }

    @Override
    public double calcularPerimetro() {
        return 2 * 3.14 * getRaio();
    }
}
