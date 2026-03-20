package Modelo;

public class Titulo {
    private String nome;
    private int tempoDeDuracao;
    private int classificacaoIndicativa;
    private String sinopse;
    private String produtora;

    public Titulo(String nome, int tempoDeDuracao, int classificacaoIndicativa, String sinopse, String produtora) {
        this.nome = nome;
        this.tempoDeDuracao = tempoDeDuracao;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.sinopse = sinopse;
        this.produtora = produtora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempoDeDuracao() {
        return tempoDeDuracao;
    }

    public void setTempoDeDuracao(int tempoDeDuracao) {
        this.tempoDeDuracao = tempoDeDuracao;
    }

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(int classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }
}