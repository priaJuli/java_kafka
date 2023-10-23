/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malaulessons.malau.kafka.producer;

import malaulessons.malau.kafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;


/**
 *
 * @author User
 */
public class JsonKafkaConsumer {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
    
    @KafkaListener(topics="malau_json", groupId="myGroup")
    public void consume(User user){
        LOGGER.info(String.format("Json message recieved -> %s", user.toString()));
                
    }
}
