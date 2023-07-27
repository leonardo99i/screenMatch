package br.com.alura.screenmatch.modelos;
public class Filme {
    public String nome;
    public int anoLancamento;
    public boolean incluso;
    private double somaAvaliacao;
    private int totalAvaliacao;
    public int duracaoMin;

    int gettotalAvaliacao(){
       return totalAvaliacao;
    }

    public void exibeFilme(){
        System.out.println("Nome: " + nome);
        System.out.println("Lançamento: " + anoLancamento);

        if(incluso == true){
            System.out.println("Incluso: Sim");
        }else{
            System.out.println("Incluso: Não");
        }

        System.out.println("Total de Avaliações: " + gettotalAvaliacao());
        System.out.println("Média das Avaliação: " + mediaAvaliacoes());
        System.out.println("Tempo de Duração: " + duracaoMin);
    }

    public void avalia(double nota){
        somaAvaliacao += nota;
        totalAvaliacao++;
    }

    double mediaAvaliacoes(){
        return somaAvaliacao / totalAvaliacao;
    }
}
