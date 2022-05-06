package moine.domain;

import moine.domain.*;
import moine.infra.AbstractEvent;
import java.util.Date; 


public class SignedUp extends AbstractEvent {

    private Long id;
    private Long userId;
    private Boolean gender;
    private Date birth;
    private String location;

    public SignedUp(){
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
    
    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }
    
    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
