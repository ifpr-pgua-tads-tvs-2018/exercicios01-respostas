package pgua.eic.tvs;

public class Identificador {


    public boolean verifica(String identificador) throws Exception{


        if(identificador == null){
            throw new NullPointerException("Identificador não pode ser nulo!");
        }

        if(identificador.equals("")){
            throw  new Exception("Identificador não pode ser vazio!");
        }

        if(identificador.length() >6){
            throw new Exception("Tamanho do identificador deve ser menor do que 6!");
        }

        if(identificador.matches(".*\\W.*")){
            return false;
        }

        return identificador.substring(0,1).matches("([a-zA-Z])");
    }

}
