package exercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int hora1, hora2;
			hora1 = sc.nextInt();
			hora2 = sc.nextInt();
			
			int resultado;
			
			if(hora1 < hora2) {
				resultado = hora2 - hora1;
			}
			else {
				resultado = 24 - hora1 + hora2;
			}
			
			System.out.println("O JOGO DUROU "+resultado+" HORA(S)");
			
			sc.close();
		}

	}

}
