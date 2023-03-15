import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mensagem = "Digite:  ";
        System.out.print(mensagem.toUpperCase());
        double digite = sc.nextDouble();
        double d = Math.sqrt(digite);
        System.out.println(d);

    }
}
