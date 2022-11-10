public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ 1 - задача 1:");
        int i = 1;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("ДЗ 1 - задача 2:");
        int j = 10;
        for (j = 10; j >= 1; j--) {
            System.out.println(j);
        }

        System.out.println("ДЗ 1 - задача 3:");
        int k = 0;
        for (k = 0; k <= 17; k++) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
        }

        System.out.println("ДЗ 1 - задача 4:");
        for (j = 10; j >= -10; j--) {
            System.out.println(j);
        }
    }
}