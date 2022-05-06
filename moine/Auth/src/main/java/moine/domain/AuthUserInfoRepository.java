package moine.domain;

import moine.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="authUserInfos", path="authUserInfos")
public interface AuthUserInfoRepository extends PagingAndSortingRepository<AuthUserInfo, Long>{


}
