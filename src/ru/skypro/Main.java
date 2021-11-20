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


        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        float fullWeight = firstBoxer + secondBoxer;
        float diffWeight = secondBoxer - firstBoxer;
        System.out.println("HomeWork2. Exercise 2.");
        System.out.println("Общий вес бойцов = " + fullWeight + " кг");
        System.out.println("Разница в весе = " + diffWeight + " кг");


        int bananasGramm = 80;
        int bananasPieses = 5;
        float milkGramm = 105 / 100f;
        int milkMl = 200;
        int icecreamGramm = 100;
        int icecreamPieses = 2;
        int eggsGramm = 70;
        int eggsPieses = 4;
        float mixed = (bananasGramm * bananasPieses) + (milkGramm * milkMl) + (icecreamGramm * icecreamPieses) + (eggsGramm * eggsPieses);
        float mixedKg = mixed / 1000f;
        System.out.println("HomeWork2. Exercise 3.");
        System.out.println("Общий вес завтрака = " + mixed + " грамм");
        System.out.println("Общий вес завтрака " + mixedKg + " кг");


        int weightOffKg = 7;
        int weightOffGramm = weightOffKg * 1000;
        int value250InDay = weightOffGramm / 250;
        int value500InDay = weightOffGramm / 500;
        int middleSuccessfulDay = (value500InDay + value250InDay) / 2 % weightOffGramm;
        System.out.println("HomeWork2. Exercise 4.");
        System.out.println("Сброс веса в день по  250 гр = " + value250InDay + " дней");
        System.out.println("Сброс веса в день по  500 гр = " + value500InDay + " дней");
        System.out.println("Среднее количество дней = " + middleSuccessfulDay);


        int mashaPayMonth = 67_760;
        int denisPayMonth = 83_690;
        int christinaPayMonth = 76_230;
        float percent = 10;
        float percentPay = 1 + (percent / 100);
        float percentMashaNowPay = mashaPayMonth * percentPay;
        float mashaPayUp = percentMashaNowPay - mashaPayMonth;
        float percentDenisNowPay = denisPayMonth * percentPay;
        float denisPayUp = percentDenisNowPay - denisPayMonth;
        float percentChristinaNowPay = christinaPayMonth * percentPay;
        float christinaPayUp = percentChristinaNowPay - christinaPayMonth;
        System.out.println("HomeWork2. Exercise 5.");
        System.out.println("Маша теперь получает = " + percentMashaNowPay + " рублей");
        System.out.println("Годовой доход Маши вырос на: " + mashaPayUp + " рублей");
        System.out.println("Денис теперь получает = " + percentDenisNowPay + " рублей");
        System.out.println("Годовой доход Дениса вырос на:" + denisPayUp + " рублей");
        System.out.println("Кристина теперь получает = " + percentChristinaNowPay + " рублей");
        System.out.println("Годовой доход Кристины вырос на: " + christinaPayUp + " рублей");
    }
}