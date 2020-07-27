package com.xc.cicd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CicdApplicationTests {

    @Autowired
    MyService myServ;
    
    @Test
    void Add(){
        int num = myServ.add(1, 5);
        assert num==6;
        System.out.println("ai1");
    }
    
}
