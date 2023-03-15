import java.util.Locale;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        double xA, xB, xC, yA, yB, yC;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as areas do triangulo X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Digite as areas do triangulo Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        System.out.println("Area do triangulo X: " + areaX);

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
        System.out.println("Area do triangulo X: " + areaY);

        if (areaX > areaY) {
            System.out.println("Area X é maior");
        } else {
            System.out.println("Area Y é maior");
        }
        sc.close();
    }
}

