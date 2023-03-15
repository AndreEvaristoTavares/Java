import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        funcionario.nome = scanner.next();

        System.out.print("digite o salario: ");
        funcionario.salario = scanner.nextDouble();

        System.out.print("Digite o imposto: ");
        funcionario.imposto = scanner.nextDouble();

        System.out.println("Nome: "+ funcionario.retornaNome());
        System.out.printf("Salario: %.2f\n", funcionario.retornaSalario());
        System.out.println("Imposto:" + funcionario.retornaImposto() + "%");
        System.out.printf("Salario com imposto: %.2f\n", funcionario.calculoSalarioComImposto());
        System.out.printf("Salario com aumento: %.2f\n", funcionario.salarioComAlmento());
    }
}