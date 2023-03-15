
public class Triangulo {
    private double a;
    private double b;
    private double c;
    private double res;
    private double resultado;


    public double pegaValor(double valor1, double valor2, double valor3) {
        this.a = valor1;
        this.b = valor2;
        this.c = valor3;
        this.res = (this.a + this.b + this.c) / 2.0;
        this.resultado = Math.sqrt((this.res - this.a) * (this.res - this.b) * (this.res - this.c));
        return this.resultado;
    }
    public double getResultado(){
        return this.resultado;
    }

}
