public class Novo extends Imovel {
    private double NewPreco = preco + preco * 40 / 100;

    public double getNewPreco() {
        return NewPreco;
    }

    public void setNewPreco(double NewPreco) {
        this.NewPreco = NewPreco;
    }

    public String exibirNovo() {
        return "Endereço novo: " + endereco + "\n" + "Preço novo: R$ " + getNewPreco();
    }
}