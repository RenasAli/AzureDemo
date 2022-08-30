package com.example.azuredemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

@GetMapping("/")
    public String index(){
        String a= "Hello World";
        System.out.println(a);
        return "Index";

    }

}
