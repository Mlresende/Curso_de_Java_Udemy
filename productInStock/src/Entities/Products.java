package Entities;

public class Products {
	
	private String name;
	private double price;
	private int quantity;
	
	//Construtor padão;
	public Products(){
	}
	
	//Construtor;
	public Products(String name, double price, int quantity){
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	//Exemplo de sobrecarga;
	public Products(String name, double price){
		this.name = name;
		this.price = price;
	}

	//Encapsulamento
	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return price;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	//Metodos
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}