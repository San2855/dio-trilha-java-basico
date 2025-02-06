import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        System.out.println("Por favor, digite o número da agência!:");
        Scanner scanner = new Scanner(System.in);
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o nome do cliente:");
        scanner.nextLine();
        nomeCliente = scanner.nextLine();

        System.out.println("Olá " +nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+ " e seu saldo " +saldo+ " já está disponível para saque");
    }
}
