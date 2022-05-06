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
    @Autowired LectureRepository lectureRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverLetureRecommended_UpdateRecommendedLecture(@Payload LetureRecommended letureRecommended){

        if(!letureRecommended.validate()) return;
        LetureRecommended event = letureRecommended;
        System.out.println("\n\n##### listener UpdateRecommendedLecture : " + letureRecommended.toJson() + "\n\n");


        

        // Sample Logic //
        Lecture.updateRecommendedLecture(event);
        

        

    }


}


