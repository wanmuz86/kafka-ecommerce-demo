package com.example.kafka_ecommerce.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

	@KafkaListener(topics="orders", groupId="payment-group")
	public void processPayment(ConsumerRecord<String,String> record) {
		String orderJson = record.value();
		System.out.println("TODO: Processing payment with order "+orderJson+" !!");
	}
}
