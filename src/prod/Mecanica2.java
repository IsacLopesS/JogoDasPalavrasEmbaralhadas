package prod;

public class Mecanica2 extends MecanicaPai{
    private int rodadas=5;

    public int getRodadas() {
        return rodadas;
    }

    public void contabilizaRodada(){
        rodadas--;
    }

    @Override
    public boolean terminou() {
        return rodadas==0;
    }

    @Override
    public void contabilizarPontuacao(boolean acertou) {

        contabilizaRodada();
        if (acertou) setPontos(getPontos()+10);
        else setPontos(getPontos()-5);
    }
}
