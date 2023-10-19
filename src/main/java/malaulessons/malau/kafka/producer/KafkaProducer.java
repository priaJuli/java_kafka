/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malaulessons.malau.kafka.producer;

import org.springframework.stereotype.Service;
import org.springframework.kafka.core.KafkaTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class KafkaProducer {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
    
    private KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    
    public void sendMessage(String message){
        LOGGER.info(String.format("Message is sent %s ", message));
        kafkaTemplate.send("malau", message);
    }
}
