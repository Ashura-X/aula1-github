package entities;

public class Product {
	
	/* 	 Atributos	 */	
	public String name;
	public double price;
	public int quantity;

	/* Contrutor */
	public Product(String name, double price, int quantity) {
		// refer�ncia para o pr�prio objeto usa this
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Sobrecarga com o construtor
	public Product(String name, double price) {
		// refer�ncia para o pr�prio objeto usa this
		this.name = name;
		this.price = price;
		//quantity = 0;
	}
	
	/* 	 M�todos   */	
	
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
		return name
				+ ", $ "
				+ String.format("%.2f", price) 
				+ ", " + quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}