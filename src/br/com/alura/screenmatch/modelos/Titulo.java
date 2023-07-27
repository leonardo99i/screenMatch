package br.com.alura.screenmatch.modelos;

public class Titulo {
    // Declaração
    private String nome;
    private int anoLancamento;
    private boolean incluso;
    private double somaAvaliacao;
    private int totalAvaliacao;

    // getters e setters
    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluso() {
        return incluso;
    }

    public double getSomaAvaliacao() {
        return somaAvaliacao;
    }

    public int getDuracaoMin() {
        return duracaoMin;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluso(boolean incluso) {
        this.incluso = incluso;
    }

    public void setSomaAvaliacao(double somaAvaliacao) {
        this.somaAvaliacao = somaAvaliacao;
    }

    public void setTotalAvaliacao(int totalAvaliacao) {
        this.totalAvaliacao = totalAvaliacao;
    }

    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }

    private int duracaoMin;

    int gettotalAvaliacao() {
        return totalAvaliacao;
    }

    // Exibe a ficha do Filme
    public void exibeFilme() {
        System.out.println("Nome: " + getNome());
        System.out.println("Lançamento: " + getAnoLancamento());

        if (isIncluso() == true) {
            System.out.println("Incluso: Sim");
        } else {
            System.out.println("Incluso: Não");
        }

        System.out.println("Total de Avaliações: " + gettotalAvaliacao());
        System.out.println("Média das Avaliação: " + mediaAvaliacoes());
        System.out.println("Tempo de Duração: " + getDuracaoMin());
    }

    // Metodo para avaliação
    public void avalia(double nota) {
        somaAvaliacao += nota;
        totalAvaliacao++;
    }

    // Metodo que calcula as médias de avaliação
    public double mediaAvaliacoes() {
        return somaAvaliacao / totalAvaliacao;
    }

}
