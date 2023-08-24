package com.jwt.service;

import java.util.concurrent.CompletableFuture;

import org.apache.kafka.common.internals.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessagePublisher {
	
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	public void sendMessageToTopic(String message) {
		
		CompletableFuture<SendResult<String, Object>> feature =  (CompletableFuture<SendResult<String, Object>>) kafkaTemplate.send("kafkapub-demo1", message);
		feature.whenComplete(result, ex) -> {
			if(ex==null)
		}
		
	} 
	
	

}
