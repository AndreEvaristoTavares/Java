import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        product.setName(sc.next());
        product.setPrice(sc.nextDouble());

        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getQuantity());
    }
}