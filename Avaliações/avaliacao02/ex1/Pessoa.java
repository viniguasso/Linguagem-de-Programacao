public class Pessoa {
    String nome;
    private int anoNasc; 
    private double altura;
    private int idade;

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade - anoNasc;
    }
    public void setNome(Object object) {
        this.nome = (String) object;
    }
    public int getAnoNasc() {
        return anoNasc;
    }
    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double string) {
        this.altura = string;
    }

}
