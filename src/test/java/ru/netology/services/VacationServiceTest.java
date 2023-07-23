package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VacationServiceTest {
    @Test
    public void testData1(){
        VacationService service= new VacationService();
        int expected = 3;
        int actual = service.calcWork(3000,10000,20000);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void  testData2(){
        VacationService service = new VacationService();
        int expectet = 2;
        int actual = service.calcWork(60000,100000,150000);
        Assertions.assertEquals(expectet,actual);
    }

}