package com.dwijen.Redis.practice;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by dkirtan on 7/7/17.
 */
public class RedisConnection {
    public static void main(String args[]) {

        JedisPool pool = new JedisPool("127.0.0.1");
        Jedis jedis = pool.getResource();
        jedis.set("cache", "cache-value");
        String op = jedis.get("cache");
        System.out.println(op);
    }
}
