import java.util.Scanner;

public class ContaTerminal {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        System.out.println("Insira o número da conta: ");
        short numero = Short.parseShort(sc.nextLine());

        System.out.println("Insira a agencia da conta: ");
        String agencia = sc.nextLine();

        System.out.println("Insira seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Insira seu saldo: ");
        double saldo = Double.parseDouble(sc.nextLine());
        sc.close();

        System.out.println(String.format(
              "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
              nomeCliente, agencia, numero, saldo));
        
     }
}
