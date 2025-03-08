import java.util.Scanner;

public class ContaTerminal {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número da conta: ");
        short numero = sc.nextShort();

        System.out.println("Insira a agencia da conta: ");
        String agencia = sc.nextLine();

        System.out.println("Insira seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Insira seu saldo: ");
        double saldo = sc.nextDouble();

        
     }
}
