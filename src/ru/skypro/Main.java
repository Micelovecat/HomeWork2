package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int a = 3;
        float b = 5.1f;
        long c = 4L;
        byte d = 1;
        short e = 2;
        double f = 6.1;
        char g = 0;
        boolean h = d > e;
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
        float milkNumber = milkMl / 100;
        float milkWeightGr = milkNumber * milkWeightGmPer100Ml;
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
        float percentPay = 1 + (salaryIncreasPercent / 100);
        float percentMashaNewPay = mashaSalary * percentPay;
        float mashaPayUpYear = percentMashaNewPay - mashaSalary;
        float percentDenisNewPay = denisSalary * percentPay;
        float denisPayUpYear = percentDenisNewPay - denisSalary;
        float percentChristinaNewPay = christinaSalary * percentPay;
        float christinaPayUpYear = percentChristinaNewPay - christinaSalary;
        System.out.println("HomeWork2. Exercise 5.");
        System.out.println("Маша теперь получает = " + percentMashaNewPay + " рублей");
        System.out.println("Годовой доход Маши вырос на: " + mashaPayUpYear + " рублей");
        System.out.println("Денис теперь получает = " + percentDenisNewPay + " рублей");
        System.out.println("Годовой доход Дениса вырос на:" + denisPayUpYear + " рублей");
        System.out.println("Кристина теперь получает = " + percentChristinaNewPay + " рублей");
        System.out.println("Годовой доход Кристины вырос на: " + christinaPayUpYear + " рублей");
    }
}