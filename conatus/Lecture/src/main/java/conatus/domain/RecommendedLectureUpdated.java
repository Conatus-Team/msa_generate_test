package conatus.domain;

import conatus.domain.*;
import conatus.infra.AbstractEvent;


public class RecommendedLectureUpdated extends AbstractEvent {

    private Long id;

    public RecommendedLectureUpdated(){
        super();
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
