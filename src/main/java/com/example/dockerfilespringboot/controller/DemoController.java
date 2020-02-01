package com.example.dockerfilespringboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@RestController
public class DemoController {
    private static AtomicInteger count = new AtomicInteger();
    @RequestMapping("/demo")
    public String index(){
        int a = count.addAndGet(1);
        log.info("OK"+a);
        return "OK"+a;
    }
}
