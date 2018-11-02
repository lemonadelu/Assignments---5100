import java.util.ArrayList;
import java.util.Collections;

public class SortedArray {
    private static double median;

    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        ArrayList<Integer> list = new ArrayList<>();
        int n = (nums1.length + nums2.length) % 2;
        for(Integer num1: nums1) {
            list.add(num1);
        }
        for(Integer num2: nums2){
            list.add(num2);
        }
        Collections.sort(list);
        System.out.println(list);

        if(n == 1){
            int index = Math.round(list.size() / 2);
            median = list.get(index);
        }
        if(n == 0){
            int index = list.size() / 2;
            median = (double) (list.get(index) + list.get(index - 1)) / 2;
        }
        System.out.print("The median is: "+ median);
        return median;
    }
    public static void main(String[] args){
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        findMedianSortedArrays(nums1, nums2);
    }
}
