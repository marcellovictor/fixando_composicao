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
		
		Product p1 = new Product("Celular", 1199.99);
		Product p2 = new Product("Playstation", 3299.99);
		
		OrderItem oi1 = new OrderItem(3, 1199.99, p1);
		OrderItem oi2 = new OrderItem(2, 3299.99, p2);
		
		Client client = new Client("Alex Ferguson",
				"alexferguson@gmail.com",
				DateFormats.standard.parse("31/12/1941"));
		
		Order order = new Order(new Date(), OrderStatus.valueOf("SHIPPED"), client);
		order.addItem(oi1);
		order.addItem(oi2);
		
		System.out.println(oi1);
		System.out.println(client);
		System.out.println();
		System.out.println(order);
		
		
		
		
		
		sc.close();

	}

}
