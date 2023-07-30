import java.util.Arrays;
public class Smallest_No_In_Array {
    public static void main(String[] args) {
        int[] arr = {54,32,5,3,254,6,54,32,0,12,3,66,789,54,32,64,5};
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
