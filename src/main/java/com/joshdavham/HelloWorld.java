package com.joshdavham;

import io.javalin.Javalin;

public class HelloWorld {
    static void main() {
        var app = Javalin.create(/*config*/)
                .get("/", ctx -> ctx.result("Hello World"))
                .start(7070);
    }
}
