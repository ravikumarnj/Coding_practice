import java.util.Arrays;

public class MinSumOfAnyWindowK {
    public static int minSum(int[] nums,int k){
        int min = Integer.MAX_VALUE;
        int windowSum = 0;

        int st = 0;
        int end = 0;

        while(end<nums.length){
            windowSum+=nums[end];
            if(end-st+1 == k){
                min = Math.min(min,windowSum);
                windowSum-=nums[st++];
            }
            end++;
        }
        return min;
    }

     // this method gives the  "" min values ""

    public static int[] minSumval(int[] nums,int k){
        int min = Integer.MAX_VALUE;
        int windowSum = 0;

        int st = 0;
        int end = 0;
        int stt = 0;

        while(end<nums.length){
            windowSum+=nums[end];
            if(end-st+1 == k){
                if(min>windowSum){
                    min = windowSum;
                    stt = st;
                }
                windowSum-=nums[st++];
            }
            end++;
        }
        return new int[]{nums[stt],nums[stt+1],nums[stt+2]};
    }

    public static void main(String[] args) {
        int[] arr = {4,2,1,7,8,1,2,1};
        int k = 3;
        System.out.println(minSum(arr, k));
        int[] t = minSumval(arr, k);


        System.out.println(Arrays.toString(t));
    }
}
