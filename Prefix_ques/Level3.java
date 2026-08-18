import java.util.Arrays;

public class Level3 {
    public static void main(String[] args) {
        int [] arr1 = {4, 2, 7, 1};
        System.out.println("Prefixed Sum Array = "+Arrays.toString(prefixSum(arr1)));
    }

    // 1.Sum of Every Subarray Starting at 0  (classical prefix sum question.)
    static int[] prefixSum(int[] nums){
        int[] temp = new int[nums.length];
        temp[0] = nums[0];
        for(int i= 1;i < nums.length;i++){
            temp[i] = temp[i-1] + nums[i];
        }
        return temp;
    }
}
