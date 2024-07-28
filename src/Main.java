//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//task 1
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
//task 2
        for (int g = 10; g >= 1; g--) {
            System.out.println("g = " + g);
        }
//task 3
        for (int f = 0; f <= 17; f= f + 2) {
            System.out.println("f = " + f);
        }
//task 4
        for (int e = 10; e >= -10; e--) {
            System.out.println("e = " + e);
        }
//task 5
        for (int y = 1904; y <= 2096; y= y + 4) {
            System.out.println(y + " год является високосным");
        }
//task 6
        for (int s = 7; s <= 98; s= s + 7) {
            System.out.println("s = " + s);
        }
//task 7
        for (int t = 1; t <= 512; t= t * 2 ) {
            System.out.println("t = " + t);
        }
//task 8
        int accumulation = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total +" рублей" );
        }
//task 9
        int contribution = 29000;
        float rate = 0.12f;
        float sum = 0f;
        for (int m = 1; m <= 12; m++) {
            sum = sum + sum * rate / 12 + contribution;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + sum +" рублей" );
        }
//task 10
        int w = 0;
        for (int r = 1; r <= 10; r ++ ) {
            w =  r * 2;
            System.out.println("2 * " + r + " = " + w);
        }
//lesson2 task 1
        int contribution1 = 15_000;
        float rate1 = 0.12f;
        float sum1 = 0f;
        int m = 0;
        while (sum1 <= 2_459_000) {
            m ++;
            sum1 = sum1 + sum1 * rate1 / 12 + contribution1;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + sum1 +" рублей" );
        }
//lesson2 task 2
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i ++;
        }
        System.out.println();
        for (int g = 10; g >= 1; g--) {
            System.out.print(g + " ");
        }
        System.out.println();
//lesson2 task 3
        int population = 12_000_000;
        float increase = 0.017f;
        float decrease = 0.008f;
        for (int j = 1; j <= 10; j ++ ) {
            population = (int) ( population + population * increase - population * decrease);
            System.out.println("Год " + j + ", численность населения составляет " + population);
        }
//lesson2 task 4
        int contribution2 = 15000;
        float rate2 = 0.07f;
        float sum2 = 0f;
        int month = 1;
        while (sum2 <= 12_000_000) {
            sum2 = sum2 + sum2 * rate2 + contribution2;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum2 +" рублей" );
            month ++;
        }
//lesson2 task 5
        int contribution3 = 15000;
        float rate3 = 0.07f;
        float sum3 = 0f;
        int month1 = 0;
        while (sum3 <= 12_000_000) {
            sum3 = sum3 + sum3 * rate3 + contribution3;
            month1 ++;
                if (month1 % 6 != 0) {
                    continue;
                }
            System.out.println("Месяц " + month1 + ", сумма накоплений равна " + sum3 +" рублей" );
        }

    }
}