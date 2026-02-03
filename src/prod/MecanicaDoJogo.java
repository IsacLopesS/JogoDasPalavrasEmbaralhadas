package prod;

public interface MecanicaDoJogo {


    public boolean terminou();

    public boolean acertou(String palavraCerta, String palavraDoJogador);

    public void contabilizarPontuacao(boolean acertou);

    public int getPontos();
    
}
