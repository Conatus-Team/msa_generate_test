package conatus.domain;

import conatus.domain.*;
import conatus.infra.AbstractEvent;


public class LectureLiked extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long lectureId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Long getLectureId() {
        return lectureId;
    }

    public void setLectureId(Long lectureId) {
        this.lectureId = lectureId;
    }
}
