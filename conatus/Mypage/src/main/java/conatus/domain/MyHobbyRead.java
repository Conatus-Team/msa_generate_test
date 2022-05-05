package conatus.domain;

import conatus.domain.*;
import conatus.infra.AbstractEvent;


public class MyHobbyRead extends AbstractEvent {

    private Long id;
    private Long userId;

    public MyHobbyRead(){
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
}
