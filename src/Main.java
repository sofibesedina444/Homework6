public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ 2 - задача 1:");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("ДЗ 2 - задача 2:");
        for (int j = 7; j <= 98; j = j + 7) {
            System.out.print(j + " ");
        }
        System.out.println(" ");

        System.out.println("ДЗ 2 - задача 3:");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
    }
}