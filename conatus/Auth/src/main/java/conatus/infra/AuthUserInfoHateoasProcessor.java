package conatus.infra;
import conatus.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class AuthUserInfoHateoasProcessor implements RepresentationModelProcessor<EntityModel<AuthUserInfo>>  {

    @Override
    public EntityModel<AuthUserInfo> process(EntityModel<AuthUserInfo> model) {
        
        return model;
    }
    
}

