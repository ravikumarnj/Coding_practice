import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeros(nums)));
        
        int[] arr = {4,2,4,0,0,3,0,5,1,0};
        System.out.println(Arrays.toString(moveFirst(arr)));
    }


    static int[] moveZeros(int [] nums){
        int ptr = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[ptr++] = nums[i];
            }
        }
        for(int i = ptr;i<nums.length;i++){
            nums[i] = 0;
        }
        return nums;
    }

    static int[] moveFirst(int [] nums){
        int ptr = nums.length-1;
        for(int i = nums.length-1;i>=0;i--){
            if(nums[i] != 0){
                nums[ptr--] = nums[i];
            }
        }

        for(int i = ptr;i>=0;i--){
            nums[i] = 0;
        }

        return nums;
    }
}
