package conatus.infra;
import conatus.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class GroupHateoasProcessor implements RepresentationModelProcessor<EntityModel<Group>>  {

    @Override
    public EntityModel<Group> process(EntityModel<Group> model) {
        
        return model;
    }
    
}

