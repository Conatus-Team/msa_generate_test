package conatus.domain;

import conatus.domain.*;
import conatus.infra.AbstractEvent;


public class PostAccessCounted extends AbstractEvent {

    private Long id;
    private Long groupId;
    private Long userId;
    private Integer postAccessCount;

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
    public Integer getPostAccessCount() {
        return postAccessCount;
    }

    public void setPostAccessCount(Integer postAccessCount) {
        this.postAccessCount = postAccessCount;
    }
}
