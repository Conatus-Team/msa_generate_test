package moine.domain;

import moine.domain.LetureRecommended;
import moine.domain.HobbyDiagnosised;
import moine.domain.GroupRecommended;
import moine.domain.HobbyRecommended;
import moine.domain.UserInfoUpdated;
import moine.domain.MyHobbyGot;
import moine.domain.HobbyRediagnosised;
import moine.RecommendSystemApplication;
import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;


@Entity
@Table(name="RecommendUserInfo_table")
public class RecommendUserInfo  {

    
    
    private Long userId;
    
    
    private Long gender;
    
    
    private Long location;
    
    
    private Long birth;
    
    
    private List<LectureId> lectureId;
    
    
    private List<GroupId> groupId;
    
    
    private Long chattingTime;
    
    
    private List<SelectedHobby> selectedHobby;
    
    
    private List<RecommendHobby> recommendedHobby;
    
    
    private List<DiagnosisedHobby> diagnosisedHobby;
    
    
    private List<SearchedLecture> searchedLecture;
    
    
    private List<SearchedGroup> searchedGroup;

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

    public Long getGender() {
        return gender;
    }

    public void setGender(Long gender) {
        this.gender = gender;
    }

    public Long getLocation() {
        return location;
    }

    public void setLocation(Long location) {
        this.location = location;
    }

    public Long getBirth() {
        return birth;
    }

    public void setBirth(Long birth) {
        this.birth = birth;
    }

    public List&lt;LectureId&gt; getLectureId() {
        return lectureId;
    }

    public void setLectureId(List&lt;LectureId&gt; lectureId) {
        this.lectureId = lectureId;
    }

    public List&lt;GroupId&gt; getGroupId() {
        return groupId;
    }

    public void setGroupId(List&lt;GroupId&gt; groupId) {
        this.groupId = groupId;
    }

    public Long getChattingTime() {
        return chattingTime;
    }

    public void setChattingTime(Long chattingTime) {
        this.chattingTime = chattingTime;
    }

    public List&lt;SelectedHobby&gt; getSelectedHobby() {
        return selectedHobby;
    }

    public void setSelectedHobby(List&lt;SelectedHobby&gt; selectedHobby) {
        this.selectedHobby = selectedHobby;
    }

    public List&lt;RecommendHobby&gt; getRecommendedHobby() {
        return recommendedHobby;
    }

    public void setRecommendedHobby(List&lt;RecommendHobby&gt; recommendedHobby) {
        this.recommendedHobby = recommendedHobby;
    }

    public List&lt;DiagnosisedHobby&gt; getDiagnosisedHobby() {
        return diagnosisedHobby;
    }

    public void setDiagnosisedHobby(List&lt;DiagnosisedHobby&gt; diagnosisedHobby) {
        this.diagnosisedHobby = diagnosisedHobby;
    }

    public List&lt;SearchedLecture&gt; getSearchedLecture() {
        return searchedLecture;
    }

    public void setSearchedLecture(List&lt;SearchedLecture&gt; searchedLecture) {
        this.searchedLecture = searchedLecture;
    }

    public List&lt;SearchedGroup&gt; getSearchedGroup() {
        return searchedGroup;
    }

    public void setSearchedGroup(List&lt;SearchedGroup&gt; searchedGroup) {
        this.searchedGroup = searchedGroup;
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
