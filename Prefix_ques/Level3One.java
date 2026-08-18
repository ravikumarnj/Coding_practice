import java.util.Arrays;

public class Level3One {
    // Suffix sum

    public static void main(String[] args) {
        int[] arr1 = {3, 5, 2, 6};
        System.out.println("suffix sum: "+Arrays.toString(suffixSum(arr1)));  // output: 16,13,8,6
    }

    // Sum of Every Subarray Ending at the Last Index (suffix sum)
    static int[] suffixSum(int[] nums){
        int[] temp = new int[nums.length];
        temp[nums.length-1] = nums[nums.length-1];
        
        for(int i = nums.length-2;i>=0;i--){
            temp[i] = nums[i]+temp[i+1];
        }

        return temp;
    }

}
