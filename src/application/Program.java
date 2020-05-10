package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Product product = new Product(null, 0);
				
		Quando executamos o comando acima, instanciamos um produto "product" com
		seus atributos “vazios”:
		nome = null
		preço = 0.0
		quantidade = 0
		
		//System.out.println(product.name);
		//System.out.println(product.price);
		//System.out.println(product.quantity);
		
		System.out.println("Enter product data: ");		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		Product product = new Product(name, price);
		
		
		
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}
}