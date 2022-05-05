package conatus.domain;

import conatus.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="hobbyInfos", path="hobbyInfos")
public interface HobbyInfoRepository extends PagingAndSortingRepository<HobbyInfo, Long>{


}
