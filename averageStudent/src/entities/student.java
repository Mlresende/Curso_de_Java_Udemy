package entities;

public class student {
	public String nome;
	public double a;
	public double b;
	public double c;
	
	public double finalGrade() {
		return a + b + c;
	}
	public double missingGrade() {
		if(finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		}else {return 0.0;}
	}
}
