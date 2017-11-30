package com.dtdb.KnowNow.interfaces;

import com.dtdb.KnowNow.model.UserType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserTypeRepository extends CrudRepository<UserType,Long> {


}
