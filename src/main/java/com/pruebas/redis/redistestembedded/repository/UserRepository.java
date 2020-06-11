package com.pruebas.redis.redistestembedded.repository;


import com.pruebas.redis.redistestembedded.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<User, UUID> {
}
