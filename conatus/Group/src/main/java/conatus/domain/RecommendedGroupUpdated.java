package conatus.domain;

import conatus.domain.*;
import conatus.infra.AbstractEvent;


public class RecommendedGroupUpdated extends AbstractEvent {

    private Long id;

    public RecommendedGroupUpdated(){
        super();
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
