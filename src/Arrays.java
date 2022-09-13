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
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 != 0) System.out.print(array[i] + 1 + " ");
    }
}
