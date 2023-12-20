package exercicio1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int inteiro;
			inteiro = sc.nextInt();
			
			if(inteiro < 0) {
				System.out.println("NEGATIVO");
			}else {
				System.out.println("NAO NEGATIVO");
			}
		}
	}
}
