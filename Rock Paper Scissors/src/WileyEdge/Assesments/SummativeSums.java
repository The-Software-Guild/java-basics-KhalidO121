package WileyEdge.Assesments;

public class SummativeSums {
    public static void main(String[] args) {
        int[] array1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] array2 = {999, -60, -77, 14, 160, 301};
        int[] array3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99};

        System.out.println("Sum of array1 is " + sumArray(array1) + "\nSum of array2 is " + sumArray(array2) + "\nSum of array3 is " + sumArray(array3));
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }
}
