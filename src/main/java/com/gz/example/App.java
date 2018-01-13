package com.gz.example;

import com.blade.Blade;

/**
 * Hello world!
 *
 * @author xiaozefeng
 */
public class App {
    public static void main(String[] args) {
        Blade.me()
                .get("/", (req, res) -> res.text("Hello Blade !"))
                .start(App.class, args);
    }
}
