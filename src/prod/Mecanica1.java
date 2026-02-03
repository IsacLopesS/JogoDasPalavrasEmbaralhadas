package prod;

public class Mecanica1 extends MecanicaPai  {
    private int vidas = 3;


    @Override
    public boolean terminou(){
        return this.vidas <= 0;
    }

    @Override
    public void contabilizarPontuacao(boolean acertou) {
        if(acertou) setPontos(getPontos()+10);
        else vidas--;
    }
}
