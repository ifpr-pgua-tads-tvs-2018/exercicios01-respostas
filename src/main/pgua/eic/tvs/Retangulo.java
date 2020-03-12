package pgua.eic.tvs;

public class Retangulo {

    private double lado1;
    private double lado2;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) throws Exception {
        if(lado1 <= 0){
            throw new Exception("Tamanho do lado1 inválido!!");
        }
        this.lado1 = lado1;
    }

    public double getLado2() {

        return lado2;
    }

    public void setLado2(double lado2) throws Exception {
        if(lado2 <= 0){
            throw new Exception("Tamanho do lado2 inválido!!");
        }
        this.lado2 = lado2;
    }

    public double calcularArea(){
        return lado1*lado2;
    }

    public double calcularPerimetro(){
        return 2*lado1 + 2*lado2;
    }


}
