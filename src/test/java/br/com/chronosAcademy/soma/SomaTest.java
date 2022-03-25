package br.com.chronosAcademy.soma;

import br.com.chronosAcademy.Media;
import org.junit.Assert;
import org.junit.Test;

public class SomaTest {

    @Test
    public void validaAprovado(){
        String nome = "Ione";
        Media media = new Media();
        String resultado = media.calculaMedia(5.0, 5.0);

        Assert.assertEquals("Aprovado", resultado);
    }
    @Test
    public void validaReprovado(){
        String nome = "Ione";
        Media media = new Media();
        String resultado = media.calculaMedia(4.8, 5.0);

        Assert.assertEquals("Reprovado", resultado);
    }

}
