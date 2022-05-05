package conatus.domain;

import conatus.domain.*;
import conatus.infra.AbstractEvent;


public class GroupSearched extends AbstractEvent {

    private Long id;
    private Long userId;
    private String keyword;

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
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
