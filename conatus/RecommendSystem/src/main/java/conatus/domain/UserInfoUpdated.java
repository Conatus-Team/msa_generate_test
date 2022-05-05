package conatus.domain;

import conatus.domain.*;
import conatus.infra.AbstractEvent;


public class UserInfoUpdated extends AbstractEvent {

    private Long id;
    private Long userId;

    public UserInfoUpdated(){
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
