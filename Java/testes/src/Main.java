import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Andre evaristo");
        p1.setIdade(31);
        p1.setAltura(1.85);
        p1.setPeso(110);
        p1.setSexo('M');

        System.out.println("Nome: "+p1.getNome());
        System.out.println("Idade: "+p1.getIdade());
        System.out.println("Altura: "+p1.getAltura());
        System.out.println("Peso: "+p1.getPeso());
        System.out.println("Sexo: "+p1.getSexo());
        System.out.printf("IMC: %.2f", p1.calculoImc()," ---- ");
        String res = (p1.calculoImc() > 30) ? " => VC ESTÁ OBESO !!!" : " => VC NÃO ESTÁ OBESO";
        System.out.println(res);

    }
}