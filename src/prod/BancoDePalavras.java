package prod;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class BancoDePalavras {
    private ArrayList<String> lista_de_palavras = new ArrayList<>();



    public BancoDePalavras() throws IOException{

        this.leitor("src/palavras.txt");
    }

    private void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = buffRead.readLine();

        while (linha != null) {
            lista_de_palavras.add(linha.trim()); // adiciona a palavra na lista
            linha = buffRead.readLine();        // lê a próxima linha
        }
        buffRead.close();
    }

    public String sortearpalavra(){
        Random random = new Random();
        int indice = random.nextInt(lista_de_palavras.size());

        return lista_de_palavras.get(indice);
    }

}
