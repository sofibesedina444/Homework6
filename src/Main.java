public class Main {
    public static void main(String[] args) {

        System.out.println("ДЗ 3 часть 2 - задача 1:");
        int startDate = 1822;
        int finalDate = 2122;
        for (int i = startDate; i <= finalDate; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("ДЗ 3 часть 2 - задача 2:");
        int constantNumber = 2;
        int multiplicationResult = 0;
        for (int i = 1; i <= 10; i++) {
            multiplicationResult = constantNumber * i;
            System.out.println(constantNumber + "*" + i + "=" + multiplicationResult);
        }
    }
}