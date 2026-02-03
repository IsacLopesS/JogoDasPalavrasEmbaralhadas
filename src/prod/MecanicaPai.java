package prod;

public abstract class MecanicaPai implements MecanicaDoJogo{
    private int pontos=0;

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Override
    public boolean acertou(String palavraCerta, String palavraDoJogador){
        return palavraCerta.equals(palavraDoJogador);
    }


}
