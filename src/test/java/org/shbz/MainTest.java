package org.shbz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main m = new Main();

    @Test
    public void add(){
        assertTrue(m.add(10,10)==20);
        assertFalse(m.add(2,3)!=5);

    }

    @Test
    public void substract(){
        assertFalse(m.substract(10,10)==0);
    }



}