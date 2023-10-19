/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malaulessons.malau.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;



@Configuration
public class KafkaTopicConfig {
    
    @Bean
    public NewTopic MalauTopics(){
        return TopicBuilder.name("malau")
                .build();
    }
    
    @Bean
    public NewTopic MalauJsonTopics(){
        return TopicBuilder.name("malau_json")
                .build();
    }
}
