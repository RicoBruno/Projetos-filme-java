package Calculadora;

import Modelo.Titulo;

public class CalculadoraDeTempo {
    private Integer tempoTotal = 0;

    public Integer getTempoTotal() {

        return tempoTotal;
    }

    public void inclui(Titulo t){

        this.tempoTotal += t.getTempoDeDuracao();
    }
}
