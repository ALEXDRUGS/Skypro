public class Arrays {
    public static void main(String[] args) {
        //Массивы ч.1
        //Задача 1
        int[] array = new int[6];
        double[] numbers = {1.57, 7.654, 9.986};
        int[] arr = {1, 2, 3};
        //Задача 2
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 11;
        array[4] = 5;
        System.out.println(array[0] + ", " + array[1] + ", " + array[2] + ", " + array[3] + ", " + array[4]);
        System.out.println(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);
        //Задача 3
        System.out.println(array[4] + ", " + array[3] + ", " + array[2] + ", " + array[1] + ", " + array[0]);
        System.out.println(numbers[2] + ", " + numbers[1] + ", " + numbers[0]);
        System.out.println(arr[2] + ", " + arr[1] + ", " + arr[0]);
        //Задача 4
        for (int j : array) {
            if (j % 2 != 0) {
                System.out.print(j + 1 + " ");
            }
        }
        spendingCount();
        fullName();
    }

    //Массивы ч.2
    //Создание массива и заполнение случайными целочисленными значениями
    public static void spendingCount() {
        java.util.Random random = new java.util.Random();
        int[] arrays = new int[30];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(100_000) + 100_000;
        }
        System.out.println();
        for (int index = 0; index < arrays.length; index++) {
            if (index == arrays.length - 1) {
                System.out.println(arrays[index]);
                break;
            }
            System.out.print(arrays[index] + " ");
        }
        //Задача 1
        int sum = 0;
        int max = 0;
        int min = 200_000;
        for (int array : arrays) {
            sum = sum + array;
            //Задача 2
            if (max < array) {
                max = array;
            }
            if (min > array) {
                min = array;
            }
        }
        //Задача 3
        double mean = (double) sum / arrays.length;
        System.out.println("Сумма затрат за месяц составила " + sum + " рублей.");
        System.out.println("Максимальная сумма затрат за день" + max + " рублей" + "\n"
                + "Минимальная сумма затрат за день " + min + " рублей");
        System.out.println("Средняя сумма затрат в месяц " + mean + " рублей");
    }

    //Задача 4
    public static void fullName() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char revers;
        int length = reverseFullName.length;
        for (int i = 0; i < length / 2; i++) {
            revers = reverseFullName[length - i - 1];
            reverseFullName[length - i - 1] = reverseFullName[i];
            reverseFullName[i] = revers;
        }
        System.out.println(reverseFullName);
    }
}