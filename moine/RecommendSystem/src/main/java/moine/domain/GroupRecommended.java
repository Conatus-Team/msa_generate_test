package moine.domain;

import moine.domain.*;
import moine.infra.AbstractEvent;


public class GroupRecommended extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long groupId;

    public GroupRecommended(){
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
    
    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
}
