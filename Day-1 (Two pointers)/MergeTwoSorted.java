import java.util.Arrays;

public class MergeTwoSorted {
    public static void main(String[] args) {
        int[] num1 = {1,4,6};
        int[] num2 = {2,3,5};

        int[] nums = new int[num1.length+num2.length];

        int st1 = 0;
        int st2 = 0;

        int ptr =0;

        while(st1<num1.length && st2<num2.length){
            if(num1[st1] == num2[st2]){
                nums[ptr++] = num1[st1++];
                nums[ptr++] = num2[st2++];
            }else if(num1[st1]<num2[st2]){
                nums[ptr++] = num1[st1++];
            }else{
                nums[ptr++] = num2[st2++];
            }
        }

        while(st1<num1.length){
            nums[ptr++] = num1[st1++];
        }

        while(st2<num2.length){
            nums[ptr++] = num2[st2++];
        }

        System.out.println(Arrays.toString(nums));
    }
}
