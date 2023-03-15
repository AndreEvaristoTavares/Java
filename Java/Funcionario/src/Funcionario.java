public class Funcionario {
    public String nome;
    public double salario;
    public double imposto;
    public double salarioBruto;

    public String retornaNome(){
        return nome;
    }
    public double retornaSalario(){
        return salario;
    }
    public double retornaImposto(){
        return imposto;
    }
    public double calculoSalarioComImposto(){
        return salarioBruto = salario - (salario * imposto / 100.0);
    }
    public double salarioComAlmento(){
        return salarioBruto += salarioBruto * 10 / 100.0;
    }
}

