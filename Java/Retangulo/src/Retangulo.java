public class Retangulo {
    public double altura;
    public double comprimento;
    public double calculoPerimetro(){
        return 2 * (altura + comprimento);
    }
    public double calculoArea(){
        return altura * comprimento;
    }
    public double calculoDiagonal(){
        return Math.sqrt(altura * altura + comprimento * comprimento);
    }



}
