package com.example.jenkinsdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class CalaculateTests {


    @Test
    void testAddnumber() {

    
        Calaculate ca=new Calaculate();
        assertEquals(5, ca.addnumber(2, 3));
    }
}
