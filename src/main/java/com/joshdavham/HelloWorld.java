package com.joshdavham;

import io.javalin.Javalin;

public class HelloWorld {
    private Javalin app;

    public HelloWorld() {
        String string = MySpecialClass.makeSparkly("Hello World");

        this.app = Javalin.create()
                .get("/", ctx -> ctx.result(string));
    }

    public Javalin getApp() {
        return app;
    }

    public static void main(String[] args) {
        new HelloWorld().getApp().start(7070);
    }
}
