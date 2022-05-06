package moine.domain;

import moine.domain.GroupJoined;
import moine.domain.GroupQuitted;
import moine.domain.PostAccessCounted;
import moine.domain.GroupSearched;
import moine.domain.GroupDetailShown;
import moine.domain.RecommendedGroupUpdated;
import moine.GroupApplication;
import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;


@Entity
@Table(name="Group_table")
public class Group  {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    private Long groupId;
    
    
    private Long memberCount;
    
    
    private String hobbyName;

    @PostPersist
    public void onPostPersist(){
        GroupJoined groupJoined = new GroupJoined();
        BeanUtils.copyProperties(this, groupJoined);
        groupJoined.publishAfterCommit();

        GroupQuitted groupQuitted = new GroupQuitted();
        BeanUtils.copyProperties(this, groupQuitted);
        groupQuitted.publishAfterCommit();

        PostAccessCounted postAccessCounted = new PostAccessCounted();
        BeanUtils.copyProperties(this, postAccessCounted);
        postAccessCounted.publishAfterCommit();

        GroupSearched groupSearched = new GroupSearched();
        BeanUtils.copyProperties(this, groupSearched);
        groupSearched.publishAfterCommit();

        GroupDetailShown groupDetailShown = new GroupDetailShown();
        BeanUtils.copyProperties(this, groupDetailShown);
        groupDetailShown.publishAfterCommit();

        RecommendedGroupUpdated recommendedGroupUpdated = new RecommendedGroupUpdated();
        BeanUtils.copyProperties(this, recommendedGroupUpdated);
        recommendedGroupUpdated.publishAfterCommit();

    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Long memberCount) {
        this.memberCount = memberCount;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }



    public static GroupRepository repository(){
        GroupRepository groupRepository = GroupApplication.applicationContext.getBean(GroupRepository.class);
        return groupRepository;
    }


    public static void updateRecommendedGroup(GroupRecommended groupRecommended){

        Group group = new Group();
        /*
        LOGIC GOES HERE
        */
        repository().save(group);


    }


}
