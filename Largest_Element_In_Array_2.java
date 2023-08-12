public class Largest_Element_In_Array_2 {
    public static void main(String[] args) {
        int[] array = {3,5,56,86,45,76,34,265,76};
        System.out.println(Largest_Element(array));
    }

    static int Largest_Element(int[] arr) {
        int max = arr[0];
        for(int i=0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
