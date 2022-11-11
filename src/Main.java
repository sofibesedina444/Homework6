public class Main {
    public static void main(String[] args) {

        System.out.println("ДЗ 1 часть 2 - задача 1:");
        double investment = 15000;
        double savings = 0;
        int month = 0;
        while (savings <= 2459000) {
            savings = savings + investment;
            month++;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");

        System.out.println("ДЗ 1 часть 2 - задача 2:");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.println("ДЗ 1 часть 2 - задача 3:");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8; // рождаемость и смертность на 1000 человек за 1 год
        int growth = (population / 1000) * (fertility - mortality); // прирост численности за 1 год
        for (int years = 1; years <= 10; years++) {
            population = population + growth;
            System.out.println("Год " + years + ", численность населения составляет " + population);
        }
    }
}