import java.util.Arrays;

public class Sort_Using_Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {4,6,3,57,4,3,54,33,5644,544,3,33,445444,3554,4454,43,6};
        System.out.println(Arrays.toString(Arrange(arr)));
    }

    static int[] Arrange(int[] arr) {
       int n = arr.length;

       for (int i = 0; i < n -1; i++) {
           for(int j = 0; j < n - i - 1; j++) {
               if (arr[j] > arr[j + 1]) {
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
       return arr;

    }
}
