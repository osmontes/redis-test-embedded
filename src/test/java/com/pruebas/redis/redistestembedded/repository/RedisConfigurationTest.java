package com.pruebas.redis.redistestembedded.repository;

import com.pruebas.redis.redistestembedded.configuration.RedisProperties;
import org.springframework.boot.test.context.TestConfiguration;
import redis.embedded.RedisServer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static org.junit.jupiter.api.Assertions.*;

@TestConfiguration
class RedisConfigurationTest {
    private RedisServer redisServer;

    public RedisConfigurationTest(RedisProperties redisProperties){
        this.redisServer = new RedisServer(redisProperties.getRedisPort());
    }

    @PostConstruct
    public void postConstruct(){
        redisServer.start();
    }

    @PreDestroy
    public void preDestroy(){
        redisServer.stop();
    }

}