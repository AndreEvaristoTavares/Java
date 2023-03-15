import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
        System.out.print("digite o nome do produto: ");
        produto.setNome(sc.next());

        System.out.print("digite o preço do produto: ");
        produto.setPreco(sc.nextDouble());

        System.out.print("digite a quantidade do produto: ");
        produto.setQuantidade(sc.nextInt());

        System.out.println("Produto: "+produto.getNome());
        System.out.println("Preço: "+ produto.getPreco());
        System.out.println("Quantidade: "+produto.getQuantidade());
        System.out.printf("Valor total: %.2f\n",produto.valorTotal(produto.getPreco(), produto.getQuantidade()));

        sc.close();

    }
}