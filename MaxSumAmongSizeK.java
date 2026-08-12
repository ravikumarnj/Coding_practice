public class MaxSumAmongSizeK {
    
    public static int maxSumOfK(int[] nums,int k){
        int max = Integer.MIN_VALUE;

        int st = 0;
        int end = 0;
        int windowSum = 0;

        while(end<nums.length){
            windowSum+=nums[end];
            if(k == end-st+1){
                max = Math.max(max,windowSum); 
                windowSum-=nums[st++];
            }
            end++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        System.out.println(maxSumOfK(arr, k));
    }
}
