package testes;

import prod.*;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;


public class EmbaralhadorTest {

    @Test
    public void DeveEmbaralharSeparandoVogaisDeconsoantes(){
        Embaralhador e = new JuntarVogais();
        Assert.assertEquals("aoocchrr",e.embaralhar("cachorro"));
    }

    @Test
    public void DeveRetornarAPalavraDetrazPraFrente(){
        Embaralhador e = new PalavraInvertida();
        Assert.assertEquals("orrohcac",e.embaralhar("cachorro"));

    }
    @Test
    public void DeveColocarAPalavraEmOrdemAlfabeticaCrescente(){
        Embaralhador e = new OrdemAlfabeticaCrescente();
        Assert.assertEquals("abcdefg",e.embaralhar("cdabfge"));

    }
    @Test
    public void DeveColocarAPalavraEmOrdemAlfabeticaDecrescente(){
        Embaralhador e = new OrdemAlfabeticaDecrescente();
        Assert.assertEquals("gfedcba",e.embaralhar("cdabfge"));

    }



}