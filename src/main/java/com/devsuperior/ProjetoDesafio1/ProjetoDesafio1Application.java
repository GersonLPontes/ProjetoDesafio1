package com.devsuperior.ProjetoDesafio1;
import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.ProjetoDesafio1.Entities.Order;
import com.devsuperior.ProjetoDesafio1.services.OrderService;

@SpringBootApplication
public class ProjetoDesafio1Application implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;

    public static void main(String[] args) {
		SpringApplication.run(ProjetoDesafio1Application.class, args);	
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Code: ");
		int code = sc.nextInt();
		
		System.out.print("Basic Price: ");
		double basic = sc.nextDouble();
		
		System.out.print("Discount: ");
		double discount = sc.nextDouble();
		

	    Order order = new Order(code,basic,discount);
	    
	    System.out.printf("Code = %d%n", code);;
		System.out.printf("Total value = %.2f%n", orderService.total(order));
		
		sc.close();
		
	}

}
