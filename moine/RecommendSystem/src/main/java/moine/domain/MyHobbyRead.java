package moine.domain;

import moine.domain.*;
import moine.infra.AbstractEvent;


public class MyHobbyRead extends AbstractEvent {

    private Long id;
    private Long userId;

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
