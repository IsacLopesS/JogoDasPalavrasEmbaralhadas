package prod;
import java.util.Arrays;

public class OrdemAlfabeticaCrescente implements Embaralhador {

    @Override
    public String embaralhar(String palavra) {

        char[] novaPalavra = palavra.toCharArray();
        Arrays.sort(novaPalavra);
        return new String(novaPalavra);
    }
}
