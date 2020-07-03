package application;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import util.DateFormats;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//Client data:
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.nextLine();
		
		//Instanciação do cliente:
		
		Client client = new Client(name, email, DateFormats.standard.parse(birthDate));
		
		//Order data:
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		//Instanciação da Order:
		
		Order order = new Order(new Date(), status, client);
				
		//Items data:
		
		for (int i=1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String product_name = sc.nextLine();
			System.out.print("Product price: ");
			Double product_price = sc.nextDouble();
			
			//Instanciação do produto:
			
			Product product = new Product(product_name, product_price);
			
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			
			//Instanciação e adição do item:
			
			OrderItem item = new OrderItem(quantity, product_price, product);
			
			order.addItem(item);
		}
		
		System.out.println();
		System.out.println(order);
		
		
		
		
		
		sc.close();

	}

}
