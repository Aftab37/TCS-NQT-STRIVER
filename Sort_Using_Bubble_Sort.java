import java.util.Arrays;

public class Sort_Using_Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 7, 2, 1, 8, 9};
        System.out.println("smallest number: " + (Smallest_No(arr)));
        System.out.println("Second smallest : " + (Second_Smallest(arr)));
        System.out.println("largest number : " + (Largest_No(arr)));
        System.out.println("Second largest : " + (Second_Largest(arr)));
    }

    static int[] Arrange(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    return array;
    }

    static int Smallest_No(int[] array) {
        int[] SortedArray = Arrange(array);
        return SortedArray[0];
    }

    static int Second_Smallest(int[] array) {
        int[] SortedArray = Arrange(array);
        return SortedArray[1];
    }

    static int Largest_No(int[] array) {
        int[] SortedArray = Arrange(array);
        return SortedArray[SortedArray.length - 1];
    }

    static int Second_Largest(int[] array) {
        int[] SortedArray = Arrange(array);
        return SortedArray[SortedArray.length - 2];
    }

}

