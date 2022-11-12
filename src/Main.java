public class Main {
    public static void main(String[] args) {

        System.out.println("ДЗ 2 часть 2 - задача 1:");
        int month = 0;
        int savings = 15000;
        while (savings < 12_000_000) {
            savings = savings + savings * 7 / 100;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
        }

        System.out.println("ДЗ 2 часть 2 - задача 2:");
        int month1 = 0;
        int savings1 = 15000;
        while (savings1 < 12_000_000) {
            savings1 = savings1 + savings1 * 7 / 100;
            month1++;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + ", сумма накоплений равна " + savings1 + " рублей");
            }
        }

        System.out.println("ДЗ 2 часть 2 - задача 3:");
        int month2 = 0;
        int savings2 = 15000;
        while (month2 < 108) { // 9 лет = 108 месяцев
            savings2 = savings2 + savings2 * 7 / 100;
            month2++;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ", сумма накоплений равна " + savings2 + " рублей");
            }
        }

        System.out.println("ДЗ 2 часть 2 - задача 4:");
        int day = 7; // 07.10.2022 год
        while (day < 31) {
            if (day % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
                day += 7;
            }
        }
    }
}