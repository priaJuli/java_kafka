/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malaulessons.malau.kafka.producer;

import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class KafkaConsumer {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
    
    @KafkaListener(topics="malau", groupId="myGroup")
    public void consume(String message){
        LOGGER.info(String.format("Message received -> %s ", message));
        
    }
}
