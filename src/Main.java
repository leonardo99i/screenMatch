import br.com.alura.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");  
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoMin(180);
        meuFilme.setIncluso(true);
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(4);
        meuFilme.avalia(7.3);

        //Imprime a Ficha do Filme
        meuFilme.exibeFilme();
    }
}
