package com.joshdavham;

import io.javalin.testtools.JavalinTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {

    @Test
    public void testRootEndpoint() {
        HelloWorld helloWorld = new HelloWorld();

        JavalinTest.test(helloWorld.getApp(), (server, client) -> {
            var response = client.get("/");
            assertEquals(200, response.code());
            assertEquals("⭐⭐⭐Hello World⭐⭐⭐", response.body().string());
        });
    }
}
