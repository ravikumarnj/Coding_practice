import java.util.Arrays;

public class SquaresOfSorted {
    public static void main(String[] args) {
        int[] nums = { -7, -3, 2, 3, 11 };

        int[] ans = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int c = nums.length - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            // if(leftSq<rightSq){
            // ans[c--] = rightSq;
            // right--;
            // }else if(leftSq>rightSq){
            // ans[c--] = leftSq;
            // left++;
            // }else{
            // ans[c--] = leftSq;
            // ans[c--] = rightSq;
            // left++;
            // right--;
            // }
            if (leftSq > rightSq) {
                ans[c--] = leftSq;
                left++;
            }else{
                ans[c--] = rightSq;
                right--;
            }

            // ans[c] = nums[left]*nums[left]; // instead of handling this separately we can
            // add it inside the condition itself. checkout above code

        }

        System.out.println(Arrays.toString(ans));
    }
}
