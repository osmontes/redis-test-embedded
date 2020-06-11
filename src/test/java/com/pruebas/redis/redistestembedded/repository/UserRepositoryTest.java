package com.pruebas.redis.redistestembedded.repository;


import com.pruebas.redis.redistestembedded.model.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;
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

    @Test
    public void findById(){
        UUID id = UUID.randomUUID();
        User user = new User(id, "Nombre");

        userRepository.save(user);

        Optional<User> userOptFinded = userRepository.findById(id);

        assertNotNull(userOptFinded.get());
    }

    @Test
    public void findByName(){

        UUID id = UUID.randomUUID();
        String name = "Nombre Usuario";
        User user = new User(id, name);

        User userSaved = userRepository.save(user);

        List<User> users = userRepository.findByName(name);
        assertTrue(users.size()>0);
        assertEquals(name, users.get(0).getName());
    }

}