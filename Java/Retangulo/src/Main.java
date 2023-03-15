import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.print("Digite a altura: ");
        retangulo.altura = sc.nextDouble();

        System.out.print("Digite o comprimento: ");
        retangulo.comprimento = sc.nextDouble();

        System.out.printf("Perimetro: %.2f\n", retangulo.calculoPerimetro());
        System.out.printf("Area: %.2f\n", retangulo.calculoArea());
        System.out.printf("Diagonal: %.2f\n", retangulo.calculoDiagonal());
        sc.close();
    }
}