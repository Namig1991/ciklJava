package ru.skypro;

public class Main {

    public static void main(String[] args) {
        for ( int nom = 10; nom >= 1; nom--) {
            System.out.print(nom + " ");
        }
        System.out.println();
        int nom2 = 0;
        while (nom2 < 10) {
            nom2++;
            System.out.print(nom2 + " ");
        }


        System.out.println();


        int friday = 6;
        for ( int reportFriday = friday; reportFriday <=31; reportFriday = reportFriday + 7) {
            System.out.println("Сегодня пятница, " + reportFriday + "-е число. Необходимо подготовить отчет!");
        }


        System.out.println();


        int year = 2020;
        int pastYears = year - 200;
        int futureYears = year + 100;
        for (int g = pastYears; g < futureYears; g++) {
            if (g % 79 == 0) {
                System.out.println(g);
            }
        }
    }
}

