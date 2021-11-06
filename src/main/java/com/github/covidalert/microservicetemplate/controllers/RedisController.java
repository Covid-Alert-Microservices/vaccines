package com.github.covidalert.microservicetemplate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController
{

    @Autowired
    private StringRedisTemplate redisTemplate;


    @GetMapping("store/{value}")
    public void store(@PathVariable("value") String value)
    {
        this.redisTemplate.opsForValue().set("key", value);
    }

    @GetMapping("restore")
    public String restore()
    {
        return this.redisTemplate.opsForValue().get("key");
    }
}
