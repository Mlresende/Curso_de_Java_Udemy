package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account_holder;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account_holder account;
		//Solicitar dados do cliente
		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.next();
		
		//Verificar se cliente deseja realizar o primeiro deposito
		System.out.print("Is there na initial deposit (y/n)?");
		char response= sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit=sc.nextDouble();
			account = new Account_holder(numberAccount, accountHolder, initialDeposit);
		}else {
			account = new Account_holder(numberAccount, accountHolder);
		}
		
		//Exibir os dados da conta(numero da conta, nome do cliente e saldo)
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		//Realizar mais um deposito.
		System.out.print("Enter deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		//Sacar valor desejavel com desconto de 5 reais.
		System.out.print("Enter deposit value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}

}
