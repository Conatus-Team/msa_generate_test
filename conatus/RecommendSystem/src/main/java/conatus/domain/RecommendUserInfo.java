package conatus.domain;

import conatus.domain.LetureRecommended;
import conatus.domain.HobbyDiagnosised;
import conatus.domain.GroupRecommended;
import conatus.domain.HobbyRecommended;
import conatus.domain.UserInfoUpdated;
import conatus.domain.MyHobbyGot;
import conatus.domain.HobbyRediagnosised;
import conatus.RecommendSystemApplication;
import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;


@Entity
@Table(name="RecommendUserInfo_table")
public class RecommendUserInfo  {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    private Long userId;

    @PostPersist
    public void onPostPersist(){
        LetureRecommended letureRecommended = new LetureRecommended();
        BeanUtils.copyProperties(this, letureRecommended);
        letureRecommended.publishAfterCommit();

        HobbyDiagnosised hobbyDiagnosised = new HobbyDiagnosised();
        BeanUtils.copyProperties(this, hobbyDiagnosised);
        hobbyDiagnosised.publishAfterCommit();

        GroupRecommended groupRecommended = new GroupRecommended();
        BeanUtils.copyProperties(this, groupRecommended);
        groupRecommended.publishAfterCommit();

        HobbyRecommended hobbyRecommended = new HobbyRecommended();
        BeanUtils.copyProperties(this, hobbyRecommended);
        hobbyRecommended.publishAfterCommit();

        UserInfoUpdated userInfoUpdated = new UserInfoUpdated();
        BeanUtils.copyProperties(this, userInfoUpdated);
        userInfoUpdated.publishAfterCommit();

        MyHobbyGot myHobbyGot = new MyHobbyGot();
        BeanUtils.copyProperties(this, myHobbyGot);
        myHobbyGot.publishAfterCommit();

        HobbyRediagnosised hobbyRediagnosised = new HobbyRediagnosised();
        BeanUtils.copyProperties(this, hobbyRediagnosised);
        hobbyRediagnosised.publishAfterCommit();

    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }



    public static RecommendUserInfoRepository repository(){
        RecommendUserInfoRepository recommendUserInfoRepository = RecommendUserInfoApplication.applicationContext.getBean(RecommendUserInfoRepository.class);
        return recommendUserInfoRepository;
    }


    public static void getMyHobby(MyHobbyRead myHobbyRead){

        RecommendUserInfo recommendUserInfo = new RecommendUserInfo();
        /*
        LOGIC GOES HERE
        */
        repository().save(recommendUserInfo);


    }


}
