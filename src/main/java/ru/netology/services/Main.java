package ru.netology.services;

public class Main {
    public static void main(String[] args) {

        VacationService service = new VacationService();
        int result = service.calcWork(3_000, 10_000, 20_000);

        System.out.println(result);
    }
}