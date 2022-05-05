package conatus.domain;

import conatus.domain.*;
import conatus.infra.AbstractEvent;

import java.util.Date; 

public class ChattingExited extends AbstractEvent {

    private Long id;
    private Long groupId;
    private Date enterdTime;
    private Date exitTime;
    private Long userId;

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
    public Date getEnterdTime() {
        return enterdTime;
    }

    public void setEnterdTime(Date enterdTime) {
        this.enterdTime = enterdTime;
    }
    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
