package com.example.kafka_ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.kafka_ecommerce.model.Order;

@Service
public class OrderService {
	
	@Autowired
	private  KafkaTemplate<String,String> kafkaTemplate;
	
	private static final String TOPIC = "orders";
	
	
	public void placeOrder(Order order) {
		// TODO:: Process in DB, eg called the repository
		
		// Convert order object to JSON or any format for the Kafka message
		// {"orderId":1, "product":"Iphone", "qunatity":1}
	       String orderJson = "{\"orderId\": \"" + order.getOrderId() + "\", \"product\": \"" + order.getProduct() + "\", \"quantity\": " + order.getQuantity() + "}";
	       kafkaTemplate.send(TOPIC, orderJson);
	}
	

}
