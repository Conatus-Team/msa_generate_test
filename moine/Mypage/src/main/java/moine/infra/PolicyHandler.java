package moine.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;

import moine.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import moine.domain.*;


@Service
public class PolicyHandler{
    @Autowired HobbyInfoRepository hobbyInfoRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverHobbyRecommended_UpdateRecommendedHobbyList(@Payload HobbyRecommended hobbyRecommended){

        if(!hobbyRecommended.validate()) return;
        HobbyRecommended event = hobbyRecommended;
        System.out.println("\n\n##### listener UpdateRecommendedHobbyList : " + hobbyRecommended.toJson() + "\n\n");


        

        // Sample Logic //
        HobbyInfo.updateRecommendedHobbyList(event);
        

        

    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverMyHobbyGot_ShowMyHobby(@Payload MyHobbyGot myHobbyGot){

        if(!myHobbyGot.validate()) return;
        MyHobbyGot event = myHobbyGot;
        System.out.println("\n\n##### listener ShowMyHobby : " + myHobbyGot.toJson() + "\n\n");


        

        // Sample Logic //
        HobbyInfo.showMyHobby(event);
        

        

    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverHobbyRediagnosised_ShowDiagnosisedHobby(@Payload HobbyRediagnosised hobbyRediagnosised){

        if(!hobbyRediagnosised.validate()) return;
        HobbyRediagnosised event = hobbyRediagnosised;
        System.out.println("\n\n##### listener ShowDiagnosisedHobby : " + hobbyRediagnosised.toJson() + "\n\n");


        

        // Sample Logic //
        HobbyInfo.showDiagnosisedHobby(event);
        

        

    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverHobbyDiagnosised_ShowDiagnosisedHobby(@Payload HobbyDiagnosised hobbyDiagnosised){

        if(!hobbyDiagnosised.validate()) return;
        HobbyDiagnosised event = hobbyDiagnosised;
        System.out.println("\n\n##### listener ShowDiagnosisedHobby : " + hobbyDiagnosised.toJson() + "\n\n");


        

        // Sample Logic //
        HobbyInfo.showDiagnosisedHobby(event);
        

        

    }


}


