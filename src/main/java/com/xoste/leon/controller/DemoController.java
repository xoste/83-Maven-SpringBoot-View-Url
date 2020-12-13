package com.xoste.leon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Leon
 */
@Controller
public class DemoController {
    @RequestMapping("/{page}")
    public String show(@PathVariable String page, Integer id, String name) {
        System.out.println(id + " " + name);
        return page;
    }
}
