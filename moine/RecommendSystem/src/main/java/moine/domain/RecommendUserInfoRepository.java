package moine.domain;

import moine.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="recommendUserInfos", path="recommendUserInfos")
public interface RecommendUserInfoRepository extends PagingAndSortingRepository<RecommendUserInfo, Long>{


}
