public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private char sexo;
    private double imc;

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public char getSexo() {
        return this.sexo;
    }

    public double getImc() {
        return this.imc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double calculoImc() {
        this.imc = this.peso / (this.altura * this.altura);
        return this.imc;
    }



}
