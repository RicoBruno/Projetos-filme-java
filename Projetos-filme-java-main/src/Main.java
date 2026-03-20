import Modelo.Filme;
import Modelo.Serie;
import Modelo.Titulo;
import Calculadora.CalculadoraDeTempo;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        ArrayList<Titulo> lista = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- BRUNOFLIX MENU ---");
            System.out.println("1 - Adicionar Filme");
            System.out.println("2 - Adicionar Série");
            System.out.println("3 - Ver Catálogo e Tempo Total");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeF = leitura.nextLine();
                    System.out.print("Duração (min): ");
                    int duracaoF = leitura.nextInt();
                    leitura.nextLine();
                    System.out.print("Sinopse: ");
                    String sinopseF = leitura.nextLine();
                    System.out.print("Classificação: ");
                    int classF = leitura.nextInt();
                    leitura.nextLine();
                    System.out.print("Produtora: ");
                    String prodF = leitura.nextLine();
                    System.out.print("Bilheteria: ");
                    int bilF = leitura.nextInt();

                    Filme f = new Filme(nomeF, duracaoF, classF, sinopseF, prodF, bilF);
                    lista.add(f);
                    calculadora.inclui(f);
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeS = leitura.nextLine();
                    System.out.print("Sinopse: ");
                    String sinopseS = leitura.nextLine();
                    System.out.print("Classificação: ");
                    int classS = leitura.nextInt();
                    leitura.nextLine();
                    System.out.print("Produtora: ");
                    String prodS = leitura.nextLine();
                    System.out.print("Temporadas: ");
                    int tempS = leitura.nextInt();
                    System.out.print("Minutos por Temporada: ");
                    int minS = leitura.nextInt();

                    Serie s = new Serie(nomeS, classS, sinopseS, prodS, tempS, minS);
                    lista.add(s);
                    calculadora.inclui(s);
                    break;

                case 3:
                    System.out.println("\n--- LISTA DE TÍTULOS ---");
                    for (Titulo item : lista) {
                        System.out.println(item.getNome() + " [" + item.getProdutora() + "] - " + item.getTempoDeDuracao() + " min");
                    }
                    System.out.println("\nTempo total de maratona: " + calculadora.getTempoTotal() + " minutos");
                    break;
            }
        }
        leitura.close();
    }
}