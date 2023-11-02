package com.cybersoft.demospringboot03.controller;

import com.cybersoft.demospringboot03.payload.request.LoginRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @Controller:dùng để định nghĩa đường dẫn mà nội dung đường dẫn trả ra html
 * @ResponseBody: giúp cho @Controller có thể tra ra kiểu String dùng để viết API
 *
 * @RestController: Là sự kết hợp của @controller và @ResponseBody => Viết API
 */

@RestController
@RequestMapping("/hello")
public class HelloController {
    /**
     *  Tham số truyền  truyền trên trình duyệt:@RequestParam
     *  Tham số truyền ngầm:@RequestParam
     *  Tham số đóng vai trò như là một đường dẫn: @PathVariable
     *  Tham số truyền ngầm là đối tượng: @RequestBody
     *
     */

    @GetMapping("")
    public String hello(@RequestParam String hoten,@RequestParam int tuoi){
        return "Hello Spring Boot " + hoten + "- tuoi " + tuoi;
    }

    @PostMapping("/cybersoft")
    public String helloCyberSoft(@RequestBody LoginRequest loginRequest){
        return  "Hello Spring Cybersoft "+ loginRequest.getUsername() + " - " + loginRequest.getPassword() ;

    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable int id){

        return new ResponseEntity<>("Update " + id, HttpStatus.OK);
    }
}
