import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.printf("Digite o numero da conta: ");
        conta.setNumber(scanner.nextInt());
        System.out.printf("Digite o nome do titular: ");
        conta.setHolder(scanner.next());

        System.out.println("Conta: " + conta.getNumber());
        System.out.println("Titular: " + conta.getHolder());
        System.out.println("Saldo: " + conta.getSaldo());

            while (true) {
                System.out.printf("digite (Y) para fazer deposito ou (N) para prosseguir: ");
                conta.setFazerDeposito(scanner.next().charAt(0));
                if (conta.getFazerDeposito() == 'y') {
                    System.out.printf("Digite o valor do outro deposito: ");
                    conta.setSaldo(scanner.nextDouble());
                    continue;
                } else if (conta.getFazerDeposito() == 'n') {
                    System.out.println("Saldo: " + conta.getSaldo());
                    break;
                } else {
                    System.out.println("Opcao invalida recomece");
                    continue;
                }
            }
            while (true){
                System.out.printf("fazer saque (Y) sim (N) nao: ");
                conta.setFazerDeposito(scanner.next().charAt(0));
                if (conta.getFazerDeposito() == 'y'){
                    System.out.printf("digite o valor do saque: ");
                    conta.setSaque(scanner.nextDouble());
                } else if (conta.getFazerDeposito() == 'n') {
                    System.out.println("saldo atual: "+ conta.getSaldo());
                    break;
                } else {
                    System.out.println("Opcao invalida recomece");
                    continue;
                }
            }



    }
}