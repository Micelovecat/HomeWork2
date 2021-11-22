package ru.skypro;

public class Main {
    public static void main(String[] args) {
        HomeWorkEasy();
        HomeWorkHard6();
        HomeWorkHard7_1();
        HomeWorkHard7_2();
        HomeWorkHard8();
    }

    public static void HomeWorkEasy() {
        int a = 3;
        float b = 5.1f;
        long c = 4L;
        byte d = 1;
        short e = 2;
        double f = 6.1;
        char g = 0;
        boolean h = false;
        System.out.println("HomeWork2. Exercise 1.");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);


        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        float fullBoxerWeight = firstBoxerWeight + secondBoxerWeight;
        float diffBoxerWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("HomeWork2. Exercise 2.");
        System.out.println("Общий вес бойцов = " + fullBoxerWeight + " кг");
        System.out.println("Разница в весе = " + diffBoxerWeight + " кг");


        int bananasGramm = 80;
        int bananasThings = 5;
        int milkMl = 200;
        int milkWeightGmPer100Ml = 105;
        int milkNumber = milkMl / 100;
        int milkWeightGr = milkNumber * milkWeightGmPer100Ml;
        int icecreamGramm = 100;
        int icecreamThings = 2;
        int eggsGramm = 70;
        int eggsThings = 4;
        float totalWeightGr = (bananasGramm * bananasThings) + milkWeightGr + (icecreamGramm * icecreamThings) + (eggsGramm * eggsThings);
        float totalWeightKg = totalWeightGr / 1000f;
        System.out.println("HomeWork2. Exercise 3.");
        System.out.println("Общий вес завтрака = " + totalWeightGr + " грамм");
        System.out.println("Общий вес завтрака " + totalWeightKg + " кг");


        int weightOffKg = 7;
        int weightOffGr = weightOffKg * 1000;
        int dietDays250gmPerDay = weightOffGr / 250;
        int dietDays500gmPerDay = weightOffGr / 500;
        int middleDietDay = (dietDays500gmPerDay + dietDays250gmPerDay) / 2 % weightOffGr;
        System.out.println("HomeWork2. Exercise 4.");
        System.out.println("Сброс веса в день по  250 гр = " + dietDays250gmPerDay + " дней");
        System.out.println("Сброс веса в день по  500 гр = " + dietDays500gmPerDay + " дней");
        System.out.println("Среднее количество дней = " + middleDietDay);


        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int christinaSalary = 76_230;
        float salaryIncreasPercent = 10;
        float percentSalary = 1 + (salaryIncreasPercent / 100);
        float mashaNewSalary = mashaSalary * percentSalary;
        float mashaSalaryMonthUp = mashaNewSalary - mashaSalary;
        float mashaSalaryYearUp = (mashaNewSalary * 12) - (mashaSalary * 12);
        float denisNewSalary = denisSalary * percentSalary;
        float denisSalaryMonthUp = (denisNewSalary * 12) - (denisSalary * 12);
        float denisSalaryYearUp = denisNewSalary - denisSalary;
        float christinaNewSalary = christinaSalary * percentSalary;
        float christinaSalaryMonthUp = (christinaNewSalary * 12) - (christinaSalary * 12);
        float christinaSalaryYearUp = christinaNewSalary - christinaSalary;
        System.out.println("HomeWork2. Exercise 5.");
        System.out.println("Маша теперь получает = " + mashaNewSalary + " рублей");
        System.out.println("Месячный доход Маши вырос на: " + mashaSalaryMonthUp + " рублей");
        System.out.println("Годовой доход Маши вырос на: " + mashaSalaryYearUp + " рублей");
        System.out.println("Денис теперь получает = " + denisNewSalary + " рублей");
        System.out.println("Месячный доход Дениса вырос на: " + denisSalaryMonthUp + " рублей");
        System.out.println("Годовой доход Дениса вырос на:" + denisSalaryYearUp + " рублей");
        System.out.println("Кристина теперь получает = " + christinaNewSalary + " рублей");
        System.out.println("Месячный доход Кристины вырос на: " + christinaSalaryMonthUp + " рублей");
        System.out.println("Годовой доход Кристины вырос на: " + christinaSalaryYearUp + " рублей");
    }

    public static void HomeWorkHard6() {
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        int resultPlus = result * -1;

        System.out.println("HomeWork2. Exercise 6.");
        System.out.println("Результат = " + result);
        System.out.println("Результат положительный = " + resultPlus);
    }

    public static void HomeWorkHard7_1() {
        System.out.println("HomeWork2. Exercise 7.1");
        int a = 5;
        System.out.println("Было a = " + a);
        a = 7;
        int b = 7;
        System.out.println("Было b = " + b);
        b = 5;

        System.out.println("Стало a = " + a);
        System.out.println("Стало b = " + b);
    }

    public static void HomeWorkHard7_2() {
        int a = 5;
        int b = 7;

        System.out.println("HomeWork2. Exercise 7.2");
        System.out.println("Было a = " + a + ";" + " Было b = " + b + ".");

        a = (a * b);
        b = a / b;
        a = a / b;
        System.out.println("Стало a = " + a + ";" + " Стало b = " + b + ".");
    }

    public static void HomeWorkHard8() {
        int a = 892;
        a = a / 10;
        int b = a % 10;
        System.out.println("HomeWork2. Exercise 8");
        System.out.println("b = " + b);
    }
}