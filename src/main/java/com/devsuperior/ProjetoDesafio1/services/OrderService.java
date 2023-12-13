package com.devsuperior.ProjetoDesafio1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.ProjetoDesafio1.Entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	


	public double total(Order order) {
		
		return order.getBasic() - (order.getDiscount() * order.getBasic() / 100) + shippingService.shipment(order);
		
	}

}
