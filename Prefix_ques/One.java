import java.util.Arrays;

class One{
    public static void main(String[] args) {
        int[] nums = {3, 2, 5, 1, 6};
        int [] temp = new int[nums.length];
        temp[0] = nums[0];
        
        for (int st= 1;st<nums.length;st++){
            temp[st] = nums[st]+temp[st-1];
        }

        System.out.println(Arrays.toString(temp));
        System.out.println(getSum(temp, 1, 3));
    }

    static int getSum(int[] nums,int from ,int to){
        return nums[to]-nums[from-1];
    }
}