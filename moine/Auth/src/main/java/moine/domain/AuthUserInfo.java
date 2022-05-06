package moine.domain;

import moine.domain.SignedUp;
import moine.AuthApplication;
import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;


@Entity
@Table(name="AuthUserInfo_table")
public class AuthUserInfo  {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    private Long userId;
    
    
    private String nickname;
    
    
    private String email;
    
    
    private String password;

    @PostPersist
    public void onPostPersist(){
        SignedUp signedUp = new SignedUp();
        BeanUtils.copyProperties(this, signedUp);
        signedUp.publishAfterCommit();

    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public static AuthUserInfoRepository repository(){
        AuthUserInfoRepository authUserInfoRepository = AuthUserInfoApplication.applicationContext.getBean(AuthUserInfoRepository.class);
        return authUserInfoRepository;
    }




}
