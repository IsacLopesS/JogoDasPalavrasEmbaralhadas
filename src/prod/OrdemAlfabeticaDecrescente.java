package prod;

import java.util.Arrays;

public class OrdemAlfabeticaDecrescente implements Embaralhador {


    @Override
    public String embaralhar(String palavra) {
        char[] novaPalavra = palavra.toCharArray();
        Arrays.sort(novaPalavra);
        String palavraInvertida = "";
        int tam = palavra.length();
        for(int i=tam-1;i>=0;i--) palavraInvertida+=novaPalavra[i];

        return palavraInvertida;
    }
}

