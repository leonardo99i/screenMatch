import br.com.alura.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoLancamento = 1970;
        meuFilme.duracaoMin = 180;
        meuFilme.incluso = true;
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(4);
        meuFilme.avalia(7.3);

        //Imprime a Ficha do Filme
        meuFilme.exibeFilme();
    }
}
