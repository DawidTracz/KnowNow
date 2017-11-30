package com.dtdb.KnowNow.interfaces;

import com.dtdb.KnowNow.model.Status;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends CrudRepository<Status,Long> {

}
