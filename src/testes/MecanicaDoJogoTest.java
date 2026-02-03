package testes;

import org.junit.jupiter.api.Test;
import prod.Mecanica2;
import prod.MecanicaDoJogo;

import static org.junit.jupiter.api.Assertions.*;


public class MecanicaDoJogoTest {
    private MecanicaDoJogo m;
    private Mecanica2 m2;

    @Test
    public void contablizaPontuacaoMecanica2(){
        m = new Mecanica2();
        m.contabilizarPontuacao(true);
        assertEquals(10,m.getPontos());
        m.contabilizarPontuacao(true);
        assertEquals(20,m.getPontos());
        m.contabilizarPontuacao(false);
        assertEquals(15,m.getPontos());
    }

    @Test
    public void DeveHaver5RodadasNaMecanica2(){
        m2 = new Mecanica2();
        assertEquals(5,m2.getRodadas());
        m2.contabilizarPontuacao(true);
        assertEquals(4,m2.getRodadas());
        assertFalse(m2.terminou());
        m2.contabilizarPontuacao(true);
        assertEquals(3,m2.getRodadas());
        assertFalse(m2.terminou());
        m2.contabilizarPontuacao(false);
        assertEquals(2,m2.getRodadas());
        assertFalse(m2.terminou());
        m2.contabilizarPontuacao(false);
        assertEquals(1,m2.getRodadas());
        assertFalse(m2.terminou());
        m2.contabilizarPontuacao(false);
        assertEquals(0,m2.getRodadas());
        assertTrue(m2.terminou());

    }

}