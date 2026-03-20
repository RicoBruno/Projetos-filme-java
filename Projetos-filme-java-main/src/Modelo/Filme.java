package Modelo;

public class Filme extends Titulo {
    private int bilheteria;

    public Filme(String nome, int tempoDeDuracao, int classificacao, String sinopse, String produtora, int bilheteria) {
        super(nome, tempoDeDuracao, classificacao, sinopse, produtora);
        this.bilheteria = bilheteria;
    }

    public int getBilheteria() {
        return bilheteria;
    }

    public void setBilheteria(int bilheteria) {
        this.bilheteria = bilheteria;
    }
}