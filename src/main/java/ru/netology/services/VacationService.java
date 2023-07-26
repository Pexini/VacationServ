package ru.netology.services;

public class VacationService {
    public int calcWork(int expense, int income, int threshold) {
        int court = 0;
        int money = 0;

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                money = (threshold - expense) / 3*2;  //отдыхаем
                court++;

            } else {
                money += income;                //работаем
                money -= expense;
            }

        }
        return court;
    }
}
