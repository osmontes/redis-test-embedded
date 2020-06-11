package com.pruebas.redis.redistestembedded.repository;


import com.pruebas.redis.redistestembedded.model.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = RedisConfigurationTest.class)
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveUserTest(){
        UUID id = UUID.randomUUID();
        User user = new User(id, "Nombre");

        User userSaved = userRepository.save(user);

        assertNotNull(userSaved);
    }

}