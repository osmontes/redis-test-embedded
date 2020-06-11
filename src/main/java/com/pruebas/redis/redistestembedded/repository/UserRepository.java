package com.pruebas.redis.redistestembedded.repository;


import com.pruebas.redis.redistestembedded.model.User;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<User, UUID> {

    @Query("SELECT t FROM User t where t.name = :name")
    List<User> findByName(String name);
}
