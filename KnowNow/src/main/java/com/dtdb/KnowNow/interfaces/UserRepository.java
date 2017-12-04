package com.dtdb.KnowNow.interfaces;

import com.dtdb.KnowNow.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{


    List<User> findBySurname(String Name);




}
