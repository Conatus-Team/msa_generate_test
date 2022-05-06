package moine.domain;

import moine.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="groups", path="groups")
public interface GroupRepository extends PagingAndSortingRepository<Group, Long>{


}
