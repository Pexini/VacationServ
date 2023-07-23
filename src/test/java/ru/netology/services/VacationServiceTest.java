package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class VacationServiceTest {


    @Test
    public void testData1() {
        VacationService service = new VacationService();
        int expected = 3;
        int actual = service.calcWork(3000, 10000, 20000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testData2() {
        VacationService service = new VacationService();
        int expectet = 2;
        int actual = service.calcWork(60000, 100000, 150000);
        Assertions.assertEquals(expectet, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "3000, 10000, 20000, 3",
            "60000,100000,150000,2"
    })
    public void testData3(int expense, int income, int threshold, int expected) {
        VacationService service = new VacationService();

        int actual = service.calcWork(expense, income, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "src/test/resources/data.csv")
    public void testData4(int expense, int income, int threshold, int expected) {
        VacationService service = new VacationService();
        int actual = service.calcWork(expense, income, threshold);
        Assertions.assertEquals(expected, actual);
    }

}