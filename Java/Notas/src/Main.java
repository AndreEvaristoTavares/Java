import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nota nota = new Nota();
        nota.nome = scanner.next();
        nota.nota1 = scanner.nextDouble();
        nota.nota2 = scanner.nextDouble();
        nota.nota3 = scanner.nextDouble();
        System.out.println("Nome: "+ nota.getNome());
        System.out.println("Soma das notas: "+ nota.somaNotas());
        System.out.println("Resultado: "+ nota.resultado());
    }
}