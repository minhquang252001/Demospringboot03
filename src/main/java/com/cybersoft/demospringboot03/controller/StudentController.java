package com.cybersoft.demospringboot03.controller;

import com.cybersoft.demospringboot03.payload.request.StudentRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    List<StudentRequest> list = new ArrayList<>();

    @PostMapping("/param")
    public ResponseEntity<?> insertRequestParam( String name,  int age){
       StudentRequest st1 = new StudentRequest();
       st1.setName(name);
       st1.setAge(age);
       list.add(st1);

//       ResponseEntity rsp = new ResponseEntity<>("danh sach la: " + list, HttpStatus.OK);
//        return rsp;
        return new ResponseEntity<>( list, HttpStatus.OK);
    }
    @PostMapping("/inse/{name}/{age}")
    public ResponseEntity<?> insePath(@PathVariable String name,@PathVariable int age){
        StudentRequest studentRequest = new StudentRequest();
        studentRequest.setName(name);
        studentRequest.setAge(age);
        list.add(studentRequest);
        return new ResponseEntity<>( list , HttpStatus.OK);
    }

    @PostMapping("/body")
    public ResponseEntity<?> insertRequestBody(@RequestBody StudentRequest studentRequest){
        list.add(studentRequest);

//       ResponseEntity rsp = new ResponseEntity<>("danh sach la: " + list, HttpStatus.OK);
//        return rsp;
        return new ResponseEntity<>( list, HttpStatus.OK);
    }

}
