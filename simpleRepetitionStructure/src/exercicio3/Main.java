package exercicio3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in)){
			int a, b;
			System.out.println("Digite o primeiro numero");
			a = sc.nextInt();
			System.out.println("Digite o segundo numero");
			b = sc.nextInt();
			
			if(a % b == 0 || b%a == 0) {
				System.out.println("Sao Multiplos");
			}else {
				System.out.println("Nao sao Multiplos");
			}
		}
	}
}
