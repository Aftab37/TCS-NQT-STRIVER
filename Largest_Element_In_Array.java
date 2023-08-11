import java.util.Arrays;

public class Largest_Element_In_Array {
    public static void main(String[] args) {
        int[] arr = {1,6,45,7,74,8,512,7};
        System.out.println(sort(arr));
    }

    //Brute force approach
    static int sort(int[] array) {
        Arrays.sort(array);
        return array[array.length -1];
    }
}
