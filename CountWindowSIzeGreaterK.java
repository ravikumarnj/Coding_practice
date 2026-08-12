public class CountWindowSIzeGreaterK {
    
    // Count how many windows of size k have sum greater than target.

    static int countSubArray(int[] nums,int k, int target){
        int count = 0;
        int windowSum = 0;

        int st = 0;
        int end = 0;
        while(end<nums.length){
            windowSum+=nums[end];
            if(end-st+1 == k){
                if(windowSum>target){
                    count++;
                }
            windowSum-=nums[st++];
            }
            end++;
        }


        return count;
    }
    public static void main(String[] args) {
        int [] arr = {2,1,5,1,3,2,4};
        int k = 3;
        int target = 7;
        System.out.println(countSubArray(arr, k, target)); // count: 2    [2,1,5] , [5,1,3]
    }
}
