import java.util.Arrays;

public class DuchNationalFlag {
    public static void main(String[] args) {
        int[] nums = {1,0, 2, 0, 2, 1, 1, 0 ,1};

        // output:  0 0 1 1 2 2 

        int left = 0;
        int mid = 0;
        int end = nums.length-1;

        while(mid <= end){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid++] = nums[left];
                nums[left++] = temp;
            }else if(nums[mid] == 2){
                int temp = nums[end];
                nums[end--] = nums[mid];
                nums[mid] = temp;
            }else{
                mid++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
