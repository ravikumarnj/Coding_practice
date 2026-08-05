public class MaxSumSubArray {
    public static void main(String[] args) {
        // [2,1,5,1,3,2]  k = 3   ans = 9
        // [2,3,4,1,5]  k = 2     ans = 7
        
        System.out.println(findSubArraySum(new int[]{2,1,5,1,3,2}, 3));
        System.out.println(findSubArraySum(new int[]{2,3,4,1,5}, 2));

    }

    static int findSubArraySum(int[] nums,int k){
        int sum =0;

        for(int i = 0;i<k;i++){
            sum +=nums[i];
        }
        int windowSum = sum;
        int left = 0;

        for(int i = k;i<nums.length;i++){
            windowSum+=nums[i]-nums[left++];
            sum = Math.max(sum,windowSum);
        }

        return sum;
    }
}
