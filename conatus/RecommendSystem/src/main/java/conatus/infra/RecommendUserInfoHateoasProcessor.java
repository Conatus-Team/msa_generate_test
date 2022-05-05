package conatus.infra;
import conatus.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class RecommendUserInfoHateoasProcessor implements RepresentationModelProcessor<EntityModel<RecommendUserInfo>>  {

    @Override
    public EntityModel<RecommendUserInfo> process(EntityModel<RecommendUserInfo> model) {
        
        return model;
    }
    
}

