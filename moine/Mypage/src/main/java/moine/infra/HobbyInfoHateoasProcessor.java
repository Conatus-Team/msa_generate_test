package moine.infra;
import moine.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class HobbyInfoHateoasProcessor implements RepresentationModelProcessor<EntityModel<HobbyInfo>>  {

    @Override
    public EntityModel<HobbyInfo> process(EntityModel<HobbyInfo> model) {
        
        return model;
    }
    
}

