package Modelo;

public class Serie extends Titulo {
    private int temporadas;
    private int minutosPorTemporada;

    public Serie(String nome, int classificacao, String sinopse, String produtora, int temporadas, int minutosPorTemporada) {
        super(nome, 0, classificacao, sinopse, produtora);
        this.temporadas = temporadas;
        this.minutosPorTemporada = minutosPorTemporada;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getMinutosPorTemporada() {
        return minutosPorTemporada;
    }

    public void setMinutosPorTemporada(int minutosPorTemporada) {
        this.minutosPorTemporada = minutosPorTemporada;
    }

    @Override
    public int getTempoDeDuracao() {
        return this.temporadas * this.minutosPorTemporada;
    }
}