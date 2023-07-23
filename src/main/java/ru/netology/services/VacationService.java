package ru.netology.services;

public class VacationService {
    public int calcWork(int expense, int income, int threshold) {
        int court = 0;
        int money = 0;

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                money = (money - expense) - (money / 3);  //отдыхаем
                money /= 3;
                court++;

            } else {
                money += income;                //работаем
                money -= expense;
            }

        }
        return court;
    }
}
