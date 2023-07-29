import br.com.alura.screenmatch.calculos.Recomendacao;
import br.com.alura.screenmatch.calculos.calculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");  
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoMin(180);
        meuFilme.setIncluso(true);
        meuFilme.setDiretor("Copolla");
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(4);
        meuFilme.avalia(7.3);

        //Imprime a Ficha do Filme
        meuFilme.exibeFilme();
        System.out.println("");
        

        //Criando uma Ficha de Série
        Serie umaSerie = new Serie();
        umaSerie.setNome("Bones");
        umaSerie.setAnoLancamento(2005);
        umaSerie.setEpisodioPorTemporada(22);
        umaSerie.setTemporadas(12);
        umaSerie.setDuracaoMin(5000);
        umaSerie.setIncluso(true);
        umaSerie.setAtiva(false);
        umaSerie.setMinutosPorEpisodio(45);
        umaSerie.avalia(10);
        umaSerie.avalia(8);
        umaSerie.avalia(7);
        umaSerie.avalia(9);
        umaSerie.exibeSerie();
        System.out.println("");
        

        System.out.println(umaSerie.getDuracaoMin());
        
        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoLancamento(2023);
        outroFilme.setDuracaoMin(200);
        outroFilme.exibeFilme();
        outroFilme.setIncluso(true);
        System.out.println("");
        


        calculadoraDeTempo calculadora = new calculadoraDeTempo();

        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(umaSerie);
        System.out.println("Tempo Total para Maratonar: " + calculadora.getTempoTotal());
        System.out.println("");
        Recomendacao filtro = new Recomendacao();

        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(2);
        episodio.setSerie(umaSerie);
        episodio.setTotalVisualizacao(5000);
        filtro.filtra(episodio);
    }
}
