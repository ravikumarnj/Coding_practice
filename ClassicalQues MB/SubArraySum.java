public class SubArraySum {
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println("Sub Array sum: "+getSum(nums));
    }


    // this is brute force approach o(n^2)  not a optimal solution
    // public static int getSum(int [] nums){
    //     int sum = Integer.MIN_VALUE;
    //     for(int i=0;i<nums.length;i++){
    //         int windowSum = 0;
    //         for(int j=i;j<nums.length;j++){
    //             windowSum+=nums[j];
    //             sum = Math.max(sum, windowSum);
    //         }
    //     }
    //     return sum;
    // }


    // using kaden's algo

    public static int getSum(int[] nums){
        int max = nums[0];
        int currSum = nums[0];
        for(int i:nums){
            // here if the currSum becomes -ve then no need to set it to 0
            // set currSum to -ve because if next element is greater than currSum
            // then currSum have option to choose the nextValue or sumup with that value
            // * anyways if we sum up ofcourse it gonna be little less than taking that number hence
            // that number BE THE NEW CURRSUM..

            currSum = Math.max(i,currSum+i);  
            max = Math.max(max,currSum);  // here that currSum compared with out resultant
            // max if any subarray sum greater than max exists then max updates with new Subarray max.
        }

        return max;
    }
}
