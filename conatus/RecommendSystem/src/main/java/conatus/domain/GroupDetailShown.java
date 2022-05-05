package conatus.domain;

import conatus.domain.*;
import conatus.infra.AbstractEvent;


public class GroupDetailShown extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long groupId;

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