public class Nota {
    String nome;
    double nota1;
    double nota2;
    double nota3;
    double notaFinal;
    String veredicto;
    public double somaNotas(){
        notaFinal = nota1 + nota2 + nota3;
        return notaFinal;
    }
    public String resultado(){
        if (notaFinal >= 6.0){
            veredicto = "Passou";
        } else {
            veredicto = "Não passou";
        }
        return veredicto;
    }
    public String getNome(){
        return nome;
    }

}
