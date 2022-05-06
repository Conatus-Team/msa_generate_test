package moine.domain;

import moine.domain.*;
import moine.infra.AbstractEvent;


public class DiagnosisedHobbyShown extends AbstractEvent {

    private Long id;

    public DiagnosisedHobbyShown(){
        super();
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
