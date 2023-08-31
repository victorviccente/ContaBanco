import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o numero da sua agência: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o nome da sua agência: ");
		String agencia = sc.nextLine();
		System.out.print("Digite o seu nome: ");
		String nomeCliente = sc.nextLine();
		System.out.print("Digite o seu saldo: ");
		double saldo = sc.nextDouble();

		System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo no valor de R$ " + saldo + " já está disponível para saque");
		

	}

}
