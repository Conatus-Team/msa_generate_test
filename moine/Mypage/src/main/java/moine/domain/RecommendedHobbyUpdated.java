package moine.domain;

import moine.domain.*;
import moine.infra.AbstractEvent;


public class RecommendedHobbyUpdated extends AbstractEvent {

    private Long id;

    public RecommendedHobbyUpdated(){
        super();
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
