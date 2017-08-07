package org.superbiz.struts;

/**
 * Created by 423358 on 07/08/17.
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}