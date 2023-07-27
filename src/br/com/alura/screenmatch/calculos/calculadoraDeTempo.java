package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class calculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    // public void inclui(Filme f) {
    //     tempoTotal += f.getDuracaoMin();
    // }

    // public void inclui(Serie s) {
    //     tempoTotal += s.getDuracaoMin();
    // }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de: " + titulo.getNome());
        this.tempoTotal += titulo.getDuracaoMin();
    }
}
