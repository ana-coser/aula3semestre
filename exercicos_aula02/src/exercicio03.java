import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        System.out.println("Nome do Funcionário:");
        Scanner no = new Scanner(System.in);
        String nome = no.nextLine();

        System.out.println("Salário:");
        float salario = no.nextFloat();
        no.close();

        System.out.println("O Funcionário(a) " + nome + " tem um salário de: R$" + salario + " em Junho.");
    }
}