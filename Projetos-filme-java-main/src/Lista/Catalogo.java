package Lista;

import Modelo.Titulo;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Titulo> lista = new ArrayList<>();

    public void adiciona(Titulo titulo) {
        this.lista.add(titulo);
        System.out.println(titulo.getNome() + " foi adicionado aos seus favoritos!");
    }

    public void exibeLista() {
        System.out.println("--- MEU CATÁLOGO ---");
        for (Titulo t : lista) {
            System.out.println("Nome: " + t.getNome() + " | Duração: " + t.getTempoDeDuracao() + " min");
        }
    }

    public int quantidadeDeItens() {
        return lista.size();
    }


}
