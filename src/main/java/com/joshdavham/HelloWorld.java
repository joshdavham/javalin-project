package com.joshdavham;

import io.javalin.Javalin;

public class HelloWorld {
    static void main() {

        String string = MySpecialClass.makeSparkly("Hello World");

        var app = Javalin.create()
                .get("/", ctx -> ctx.result(string))
                .start(7070);
    }
}
