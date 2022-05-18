package Model;
/**
 * Classe que guarda dados de glicemia de um paciente diabetico
 * @author laboratorio
 */

public class Glicemia {
    int valorGlicemia;
    String momento;
    String data;
    String hora;
    public Glicemia(int valorGlicemia, String momento, String data, String hora) {
        this.valorGlicemia = valorGlicemia;
        this.momento = momento;
        this.data = data;
        this.hora = hora;
    }
    public int getValorGlicemia() {
        return valorGlicemia;
    }
    public void setValorGlicemia(int valorGlicemia) {
        this.valorGlicemia = valorGlicemia;
    }
    public String getMomento() {
        return momento;
    }
    public void setMomento(String momento) {
        this.momento = momento;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
}