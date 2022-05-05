package conatus.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;

import conatus.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import conatus.domain.*;


@Service
public class PolicyHandler{
    @Autowired GroupRepository groupRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverGroupRecommended_UpdateRecommendedGroup(@Payload GroupRecommended groupRecommended){

        if(!groupRecommended.validate()) return;
        GroupRecommended event = groupRecommended;
        System.out.println("\n\n##### listener UpdateRecommendedGroup : " + groupRecommended.toJson() + "\n\n");


        

        // Sample Logic //
        Group.updateRecommendedGroup(event);
        

        

    }


}


