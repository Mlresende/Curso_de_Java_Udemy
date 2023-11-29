package application;
import java.util.Locale;
import java.util.Scanner;

import entities.student;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		student stu = new student();
		
		stu.nome=sc.nextLine();
		stu.a=sc.nextDouble();
		stu.b=sc.nextDouble();
		stu.c=sc.nextDouble();
		System.out.printf("FINAL GRADE = %.2f%n", stu.finalGrade());
		
		if(stu.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", stu.missingGrade());
		}else {
			System.out.println("PASS");
		}
		sc.close();
	}

}
