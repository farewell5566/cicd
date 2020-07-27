package com.xc.cicd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ci {

    @Autowired
    MyService myServ;

    @GetMapping("/add")
    public int add(int a,int b){
        return myServ.add(a,b);
    }

}
