package pgua.eic.tvs;

public class Retangulo {

    private int lado1;
    private int lado2;

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) throws Exception {
        if(lado1 <= 0){
            throw new Exception("Tamanho do lado1 inválido!!");
        }
        this.lado1 = lado1;
    }

    public int getLado2() {

        return lado2;
    }

    public void setLado2(int lado2) throws Exception {
        if(lado2 <= 0){
            throw new Exception("Tamanho do lado2 inválido!!");
        }
        this.lado2 = lado2;
    }

    public int calcularArea(){
        return lado1*lado2;
    }

    public int calcularPerimetro(){
        return 2*lado1 + 2*lado2;
    }


}
