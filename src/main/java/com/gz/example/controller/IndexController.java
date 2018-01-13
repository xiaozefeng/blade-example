package com.gz.example.controller;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;

/**
 * @author xiaozefeng
 */
@Path
public class IndexController {

    @GetRoute("/index")
    public String hello() {
        return "index.html";
    }
}
