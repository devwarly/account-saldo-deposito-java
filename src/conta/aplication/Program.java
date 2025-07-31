package conta.aplication;
import conta.entities.Conta;

import java.util.Scanner;

public class Program {
	public static void main(String [] args) {
		Scanner en = new Scanner(System.in);
		
		Conta conta;
		
		
		System.out.print("Número da conta: ");
		int NumAccount = en.nextInt();
		
		System.out.print("Nome do titular: ");
		en.nextLine();
		String NomeTitular = en.nextLine();
		
		System.out.println();
		System.out.print("Deseja depositar saldo agora(S/N)?");
		char op = en.next().charAt(0);
		
		if (op == 'S' || op == 's'){
			System.out.println();
			System.out.print("Valor de depósito inicial: ");
			double ValorDeposito = en.nextDouble();
			
			conta = new Conta(NumAccount, NomeTitular, ValorDeposito);
		}else {
			conta = new Conta(NumAccount, NomeTitular);
		}
		
		System.out.println();
		System.out.println(conta);
	
		while(true) {
			System.out.println();
			System.out.printf("Escolha uma opção:%n%n1 - Depositar Valor%n2 - Sacar Valor%nDigite Aqui: ");
			int opcao = en.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println();
				System.out.print("Digite o valor a depositar: ");
				conta.deposito(en.nextDouble());
				System.out.println("Depósito realizado com sucesso!");
				break;
			case 2:
				System.out.println();
				System.out.print("Digite o valor para sacar: ");
				conta.saque(en.nextDouble());
				System.out.println("Saque realizado com sucesso!");
				break;
			
			default:
				System.out.println("Opção inválida!");
				break;
			}
			System.out.println();
			System.out.printf("Uptade Conta:%n");
			System.out.println(conta);
		}
		
	}
}
 