package application;

import java.util.Locale;
import java.util.Scanner;

import entities.OrderItem;
import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product("Celular", 1199.99);
		
		OrderItem oi = new OrderItem(3, 1199.99, p);
		
		System.out.println(oi);
		
		
		
		
		sc.close();

	}

}
