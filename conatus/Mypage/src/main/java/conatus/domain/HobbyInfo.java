package conatus.domain;

import conatus.domain.HobbyRediagnosisRequested;
import conatus.domain.RecommendedHobbyUpdated;
import conatus.domain.MyHobbyRead;
import conatus.domain.MyHobbyShown;
import conatus.domain.DiagnosisedHobbyShown;
import conatus.MypageApplication;
import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;


@Entity
@Table(name="HobbyInfo_table")
public class HobbyInfo  {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    private Long userId;

    @PostPersist
    public void onPostPersist(){
        HobbyRediagnosisRequested hobbyRediagnosisRequested = new HobbyRediagnosisRequested();
        BeanUtils.copyProperties(this, hobbyRediagnosisRequested);
        hobbyRediagnosisRequested.publishAfterCommit();

        RecommendedHobbyUpdated recommendedHobbyUpdated = new RecommendedHobbyUpdated();
        BeanUtils.copyProperties(this, recommendedHobbyUpdated);
        recommendedHobbyUpdated.publishAfterCommit();

        MyHobbyRead myHobbyRead = new MyHobbyRead();
        BeanUtils.copyProperties(this, myHobbyRead);
        myHobbyRead.publishAfterCommit();

        MyHobbyShown myHobbyShown = new MyHobbyShown();
        BeanUtils.copyProperties(this, myHobbyShown);
        myHobbyShown.publishAfterCommit();

        DiagnosisedHobbyShown diagnosisedHobbyShown = new DiagnosisedHobbyShown();
        BeanUtils.copyProperties(this, diagnosisedHobbyShown);
        diagnosisedHobbyShown.publishAfterCommit();

    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }



    public static HobbyInfoRepository repository(){
        HobbyInfoRepository hobbyInfoRepository = HobbyInfoApplication.applicationContext.getBean(HobbyInfoRepository.class);
        return hobbyInfoRepository;
    }


    public static void showDiagnosisedHobby(HobbyRediagnosised hobbyRediagnosised){

        HobbyInfo hobbyInfo = new HobbyInfo();
        /*
        LOGIC GOES HERE
        */
        repository().save(hobbyInfo);


    }
    public static void showDiagnosisedHobby(HobbyDiagnosised hobbyDiagnosised){

        HobbyInfo hobbyInfo = new HobbyInfo();
        /*
        LOGIC GOES HERE
        */
        repository().save(hobbyInfo);


    }


}
