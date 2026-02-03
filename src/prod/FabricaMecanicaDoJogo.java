package prod;

import java.util.ArrayList;
import java.util.Random;

public class FabricaMecanicaDoJogo {
    private ArrayList<MecanicaDoJogo> listaDeMecanicaDoJogo = new ArrayList<>();

    public FabricaMecanicaDoJogo(){
        listaDeMecanicaDoJogo.add(new Mecanica1());
        listaDeMecanicaDoJogo.add(new Mecanica2());
        //adicionar

    }

    private MecanicaDoJogo getMecanicaDoJogoAleatorio(){

        Random random = new Random();
        int indiceAleatorio = random.nextInt(listaDeMecanicaDoJogo.size());

        return listaDeMecanicaDoJogo.get(indiceAleatorio);
    }

   public MecanicaDoJogo getMecanicaDoJogo(int escolha){
        if (escolha==1) return new Mecanica1();
        if (escolha==2) return new Mecanica2();
        return getMecanicaDoJogoAleatorio();

    }


}