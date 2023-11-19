package com.example.jenkinsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String home()
    {
        return "index.html";
    }
    
    @GetMapping("/calc")
    public String Calc()
    {
        Calaculate c=new Calaculate();

        int cal=c.addnumber(5,5);

        return Integer.toString(cal);
    }
}
