public class Velho extends Imovel {
    private double OldPreco = preco - preco * 15 / 100;

    public double getOldPreco() {
        return OldPreco;
    }

    public void setOldPreco(double OldPreco) {
        this.OldPreco = OldPreco;
    }

    public String exibirVelho() {
        return "Endereço: " + endereco + "\n" + "Preço velho: R$ " + getOldPreco();
    }
}