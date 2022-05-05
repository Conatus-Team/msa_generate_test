package conatus.domain;

import conatus.domain.LectureLiked;
import conatus.domain.LectureSearched;
import conatus.domain.LectureDetailShown;
import conatus.domain.RecommendedLectureUpdated;
import conatus.LectureApplication;
import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;


@Entity
@Table(name="Lecture_table")
public class Lecture  {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    private Long lectureId;
    
    
    private Long likeCount;

    @PostPersist
    public void onPostPersist(){
        LectureLiked lectureLiked = new LectureLiked();
        BeanUtils.copyProperties(this, lectureLiked);
        lectureLiked.publishAfterCommit();

        LectureSearched lectureSearched = new LectureSearched();
        BeanUtils.copyProperties(this, lectureSearched);
        lectureSearched.publishAfterCommit();

        LectureDetailShown lectureDetailShown = new LectureDetailShown();
        BeanUtils.copyProperties(this, lectureDetailShown);
        lectureDetailShown.publishAfterCommit();

        RecommendedLectureUpdated recommendedLectureUpdated = new RecommendedLectureUpdated();
        BeanUtils.copyProperties(this, recommendedLectureUpdated);
        recommendedLectureUpdated.publishAfterCommit();

    }

    public Long getLectureId() {
        return lectureId;
    }

    public void setLectureId(Long lectureId) {
        this.lectureId = lectureId;
    }

    public Long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }



    public static LectureRepository repository(){
        LectureRepository lectureRepository = LectureApplication.applicationContext.getBean(LectureRepository.class);
        return lectureRepository;
    }


    public static void updateRecommendedLecture(LetureRecommended letureRecommended){

        Lecture lecture = new Lecture();
        /*
        LOGIC GOES HERE
        */
        repository().save(lecture);


    }


}
