import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        //Задача 1
        System.out.println("\n/Задача 1");
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //Задача 2
        System.out.println("\n/Задача 2");
        int max = arr[0], min = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. " +
                "\nМаксимальная сумма трат за день составила " + max + " рублей.");
        //Задача 3
        System.out.println("\n/Задача 3");
        double average = (double) sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", average);
        //Задача 4
        System.out.println("\n\n/Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}