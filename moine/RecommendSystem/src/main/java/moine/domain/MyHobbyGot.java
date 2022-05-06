package moine.domain;

import moine.domain.*;
import moine.infra.AbstractEvent;


public class MyHobbyGot extends AbstractEvent {

    private Long id;
    private Long userId;
    private String hobby;

    public MyHobbyGot(){
        super();
    }

    
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
    
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
