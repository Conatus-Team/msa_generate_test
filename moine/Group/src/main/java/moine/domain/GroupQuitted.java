package moine.domain;

import moine.domain.*;
import moine.infra.AbstractEvent;


public class GroupQuitted extends AbstractEvent {

    private Long id;
    private Long groupId;
    private Long userId;

    public GroupQuitted(){
        super();
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
    
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
