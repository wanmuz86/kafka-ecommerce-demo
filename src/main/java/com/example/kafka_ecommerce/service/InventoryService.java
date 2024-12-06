package com.example.kafka_ecommerce.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
	
	// ConsumerRecord is the message passed by the producer
	@KafkaListener(topics="orders", groupId="inventory-group") // It will keep listening to the message
	public void consumeOrder(ConsumerRecord<String,String> record) {
		String orderJson = record.value();
		
		System.out.println("TODO: Inventory receive message"+orderJson+" update in DB");
		
	}

}
