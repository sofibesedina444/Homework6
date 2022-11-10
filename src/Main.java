public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ 3 - задача 1:");
        int investment = 29000;
        int savings = 0;
        for (int i = 1; i <= 12; i++) {
            savings = savings + investment;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
        }

        System.out.println("ДЗ 3 - задача 2:");
        int investment1 = 29000;
        int savings1 = 0;
        for (int i = 1; i <= 12; i++) {
            savings1 = savings1 + savings1 / 100;
            savings1 = savings1 + investment1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings1 + " рублей");
        }
    }
}