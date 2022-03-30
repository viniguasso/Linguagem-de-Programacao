package revisao.Revisao;
public class Revisao {    
    public static void main (String[] args) {
        System.out.println(exibirMensagem());
        exibirResultadoSoma(2, 7);
        float precoGasolinaHoje = getGasValue();
        System.out.println("R$: " + precoGasolinaHoje);
        float largura = 2, comprimento = 4, profundidade = (float)1.32;
        calcularVolumePiscina(largura, comprimento, profundidade);
        
        //tipo nome [] = new tipo[tamanho]
        int vetorI[] = new int[2]; // [5] [10]
        //char vetorC[] = new char[2]; // ["a"] ["b"]
        //String vetorS[] = new String[2]; // ["Pedro"] ["Duda"]
        
        //vetorI[0] = 5;
        //vetorI[1] = 10;
        
        vetorI = getValues();
        
        System.out.println("Vetor: ");
        System.out.println("[0] " + vetorI[0]);
        System.out.println("[1] " + vetorI[1]);
    }
    
    public static String exibirMensagem() {
        return "Bom dia. Bem-vindo aos métodos";
    }
    
    public static void exibirResultadoSoma(int a, int b) {
        System.out.println("Soma: " + (a + b));
    }
    
    public static float getGasValue() {
        return (float)6.59;
    }
    
    public static void calcularVolumePiscina(float l, float c, float p) {
        System.out.println("O volume da piscina com medidas "+ (int)l +" X "+ (int)c +" X "+ p +" É igual a " + (l*c*p));
    }
    
    public static int[] getValues() {
        int vet[] = new int[2];
        vet[0] = 5;
        vet[1] = 10;
        return vet;
    }
}