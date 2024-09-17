package com.salih.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.time.LocalDateTime;
import java.time.LocalTime;

@RestController
@RequestMapping("/api/person")
public class PersonController {


    /*
    //   http://localhost:8080/api/person/hello
    @GetMapping("/hello")
    public String getDockerHello(){
        return "Hello Docker World : " + LocalTime.now();
    }
*/

    //  http://localhost:8080/api/person/hello
    @GetMapping("/hello")
    public String getDockerHello() {

        try {

            // get system name
            String SystemName = InetAddress.getLocalHost().getHostName();

            // SystemName stores the name of the system
            return "Hello Docker : " + SystemName  + " : " + LocalTime.now();
        } catch (Exception E) {
            System.err.println(E.getMessage());
        }


        return "Hello Docker" ;
    }
}
