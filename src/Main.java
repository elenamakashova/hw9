import java.sql.SQLOutput;

public class Main {
        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }
            public static void main(String[] args) {
                task1();
                task2();
                task3();
                task4();
            }

            public static void task1 () {
                System.out.println("Задача 1");
                int[] expenses = generateRandomArray();
                int sum = 0;
                for (int i = 0; i < expenses.length; i++) {
                    sum = sum + expenses[i];
                }
                System.out.println("Сумма трат за месяц составила " + sum + " рублей");
            }

            public static void task2 () {
                System.out.println("Задача 2");
                int[] expenses = generateRandomArray();
                int min = expenses[0];
                for (int i = 0; i < expenses.length; i++) {
                    if (expenses[i] < min) {
                        min = expenses[i];
                    }
                }
                System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
                int max = expenses[0];
                for (int i = 0; i < expenses.length; i++) {
                    if (expenses[i] > max) {
                        max = expenses[i];
                    }
                }
                System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

            }

            public static void task3 () {
                System.out.println("Задача 3");
                int[] expenses = generateRandomArray();
                int sum = 0;
                for (int i = 0; i < expenses.length; i++) {
                    sum = sum + expenses[i];
                }
                double average = sum / 30;
                System.out.println("Средняя сумма трат за месяц в день составила " + average + " рублей");
            }


            public static void task4 () {
                System.out.println("Задача 4");
                char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
                for (int i = reverseFullName.length - 1; i >= 0; i--)
                    System.out.print(reverseFullName[i]);
            }
        }