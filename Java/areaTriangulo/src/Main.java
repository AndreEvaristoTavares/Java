import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        x.pegaValor(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.printf("%.2f%n", x.getResultado());
        y.pegaValor(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.printf("%.2f%n", y.getResultado());

    }
}