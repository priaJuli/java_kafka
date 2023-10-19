/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malaulessons.malau.kafka.producer;

import malaulessons.malau.kafka.payload.User;
import org.springframework.stereotype.Service;
import org.springframework.kafka.core.KafkaTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

@Service
public class JsonKafkaProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
    
    private KafkaTemplate<String, String> kafkaTemplate;

    public JsonKafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    
    public void sendMessage(User data){
        LOGGER.info(String.format("Message sent -> %s ", data.toString()));
        
        Message<User> message = MessageBuilder.withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "malau_json")
                .build();
        
        kafkaTemplate.send(message);
    }
    
}
