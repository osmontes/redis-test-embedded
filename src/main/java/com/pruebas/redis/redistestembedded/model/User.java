package com.pruebas.redis.redistestembedded.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@RedisHash("user")
public class User {
    @Id
    private UUID id;
    private String name;
}
