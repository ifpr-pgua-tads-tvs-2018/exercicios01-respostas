package pgua.eic.tvs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RetanguloTestes {


    @Test
    public void retanguloArea_ValorCorreto_True() throws Exception{
        //cenario
        Retangulo retangulo = new Retangulo();

        retangulo.setLado1(16.9);
        retangulo.setLado2(18.4);


        //ação
        double area = retangulo.calcularArea();


        //verificação - asserção
        Assertions.assertEquals(310.96,area,0.01);

    }


    @Test
    public void retanguloPerimetro_ValorCorreto_True() throws Exception{
        //cenario
        Retangulo retangulo = new Retangulo();

        retangulo.setLado1(100.0);
        retangulo.setLado2(50.0);

        //acao
        double perimetro = retangulo.calcularPerimetro();

        //verificacao

        Assertions.assertEquals(300.0,perimetro,0.1);

    }

    @Test
    public void retanguloPerimetro_ValorIncorreto_True() throws Exception{
        //cenario
        Retangulo retangulo = new Retangulo();

        retangulo.setLado1(600.0);
        retangulo.setLado2(50.0);

        //acao
        double perimetro = retangulo.calcularPerimetro();

        //verificacao

        Assertions.assertNotEquals(300.0,perimetro,0.1);

    }


    @Test
    public void retanguloSetLado_LadoInvalido_Excessao(){

        //cenario
        Retangulo retangulo = new Retangulo();

        try{
            retangulo.setLado1(-100.0);
            Assertions.fail("Deveria ter gerado uma excessão!!!");
        }catch (Exception e){
            Assertions.assertEquals("Tamanho do lado1 inválido!!",e.getMessage());
        }

    }



}
