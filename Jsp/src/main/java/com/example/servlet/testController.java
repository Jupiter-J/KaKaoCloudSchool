package com.example.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class testController {

    @GetMapping("/")
    public String ServletTest(){
        return "send1";
    }


}
