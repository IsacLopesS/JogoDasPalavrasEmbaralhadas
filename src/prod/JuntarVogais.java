package prod;

public class JuntarVogais implements Embaralhador{

    @Override
    public String embaralhar(String palavra) {
        String vogais = "";
        String consoantes = "";
        for(char letra : palavra.toCharArray()){
            if ("aeiou".indexOf(letra) != -1) vogais+=letra;
            else consoantes+=letra;
        }
        return vogais+consoantes;
    }
}
