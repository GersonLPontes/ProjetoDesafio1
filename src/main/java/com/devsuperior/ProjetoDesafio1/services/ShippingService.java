package com.devsuperior.ProjetoDesafio1.services;


import org.springframework.stereotype.Service;

import com.devsuperior.ProjetoDesafio1.Entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		
		double orderBasic = order.getBasic();
		
		if (orderBasic < 100.00) {
			return 20.00;
			
		} else if (orderBasic >= 100.00 && orderBasic <= 200.00) {
			return 12.00;
			
		} else {
			
		    return 0;
		}
	}
}
