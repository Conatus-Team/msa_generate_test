package moine.domain;

import moine.domain.*;
import moine.infra.AbstractEvent;


public class MyHobbyShown extends AbstractEvent {

    private Long id;

    public MyHobbyShown(){
        super();
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
