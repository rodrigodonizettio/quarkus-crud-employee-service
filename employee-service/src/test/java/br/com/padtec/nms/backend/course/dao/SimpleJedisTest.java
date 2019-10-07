package br.com.padtec.nms.backend.course.dao;

import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

public class SimpleJedisTest {

    @Test
    public void shouldFail() {
        //
        // localhost:6379
        //
        Jedis jedis = new Jedis("127.0.0.1");
        jedis.set("foo", "bar");
        String value = jedis.get("foo");

    }
}
