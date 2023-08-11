public class Smallest_No_Using_Sort_Method {
    public static void main(String[] args) {
        int[] arr = {3,21,55,65,24,75,76,32,54,64,67,88,98,97,97,5,78,69965,865,556,8544,3,355};
//        int[] smallno = sort(arr);
        System.out.println(sort(arr));
    }


    static int sort (int[] no) {
        int min = no[0];
        for (int i=0; i < no.length; i++) {
            if (no[i] < min) {
                min = no[i];
            }
        }
        return min;
    }

}
