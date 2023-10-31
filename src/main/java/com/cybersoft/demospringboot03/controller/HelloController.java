package com.cybersoft.demospringboot03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Controller:dùng để định nghĩa đường dẫn mà nội dung đường dẫn trả ra html
 * @ResponseBody: giúp cho @Controller có thể tra ra kiểu String dùng để viết API
 *
 * @RestController: Là sự kết hợp của @controller và @ResponseBody => Viết API
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String hello(){
        return "Hello Spring Boot";
    }

    @GetMapping("/cybersoft")
    public String helloCyberSoft(){
        return  "Hello Spring Cybersoft";

    }
}
