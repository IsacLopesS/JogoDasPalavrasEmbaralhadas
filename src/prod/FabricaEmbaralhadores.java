package prod;

import java.util.ArrayList;
import java.util.Random;

public class FabricaEmbaralhadores {
     private ArrayList<Embaralhador> listaDeEmbaralhador = new ArrayList<>();

     public FabricaEmbaralhadores(){
         listaDeEmbaralhador.add(new JuntarVogais());
         listaDeEmbaralhador.add(new PalavraInvertida());
         listaDeEmbaralhador.add(new OrdemAlfabeticaCrescente());
         listaDeEmbaralhador.add(new OrdemAlfabeticaDecrescente());
     }

     public Embaralhador getEmbaralhadorAleatorio(){

         Random random = new Random();
         int indiceAleatorio = random.nextInt(listaDeEmbaralhador.size());

         return listaDeEmbaralhador.get(indiceAleatorio);
     }



}
