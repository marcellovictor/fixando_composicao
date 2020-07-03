package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.OrderItem;
import entities.Product;
import entities.Client;
import util.DateFormats;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product("Celular", 1199.99);
		
		OrderItem oi = new OrderItem(3, 1199.99, p);
		
		Client client = new Client("Alex Ferguson",
				"alexferguson@gmail.com",
				DateFormats.standard.parse("31/12/1941"));
		
		System.out.println(oi);
		System.out.println(client);
		
		
		
		
		sc.close();

	}

}
