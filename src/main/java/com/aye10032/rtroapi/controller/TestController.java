package com.aye10032.rtroapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: rtroapi
 * @className: TestController
 * @Description: 测试
 * @version: v1.0
 * @author: Aye10032
 * @date: 2021/4/22 上午 11:34
 */

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
