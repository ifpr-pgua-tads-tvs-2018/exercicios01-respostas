package pgua.eic.tvs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IdentifcadorTestes {


    @Test
    public void verifica_StringNula_Excessao() throws Exception{

        //cenario
        Identificador identificador = new Identificador();
        String id = null;


        //acao
        try{

            identificador.verifica(id);
            Assertions.fail("Devia ter gerado a excessão");

        }catch (NullPointerException e){
            Assertions.assertEquals("Identificador não pode ser nulo!",e.getMessage());
        }
    }

    @Test
    public void verifica_StringTamanhoSuperior_Excessao(){

        //cenario
        Identificador identificador = new Identificador();
        String id = "aalkdj13123lakd";

        //acao
        try{

            identificador.verifica(id);
            Assertions.fail("Devia ter gerado a excessão");

        }catch (Exception e){
            Assertions.assertEquals("Tamanho do identificador deve ser menor do que 6!",e.getMessage());
        }
    }

    @Test
    public void verifica_StringVazia_Excessao(){

        //cenario
        Identificador identificador = new Identificador();
        String id = "";

        //acao
        try{

            identificador.verifica(id);
            Assertions.fail("Devia ter gerado a excessão");

        }catch (Exception e){
            Assertions.assertEquals("Identificador não pode ser vazio!",e.getMessage());
        }
    }


}
