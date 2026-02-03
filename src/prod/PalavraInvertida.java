package prod;

public class PalavraInvertida implements Embaralhador{

    @Override
    public String embaralhar(String palavra) {
        String palavraInvertida = "";
        char[] p = palavra.toCharArray();
        int tam = palavra.length();
        for(int i=tam-1;i>=0;i--) palavraInvertida+=p[i];

        return palavraInvertida;
    }
}
