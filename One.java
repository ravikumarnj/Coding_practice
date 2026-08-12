public class One {
    // basic

    public static void justPrint(int[] nums,int k){
        for(int i=0;i<nums.length-k+1;i++){
            
            for(int j=i;j<i+k;j++){
                System.out.print(nums[j]+", ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        justPrint(new int[]{1,3,2,5,6}, 3);
        System.out.println("---------------------------");
        sumOfEveryWindow(new int[]{2, 4, 6, 8, 10}, 3);
    }

    // sum of window of size K.
    public static void sumOfEveryWindow(int[] nums,int k){
        int st = 0;
        int end = 0;
        int windowSum = 0;

        for(;end<nums.length;end++){
            windowSum+=nums[end];

            if(end-st+1 == k){
                System.out.println(windowSum);
                windowSum-=nums[st++];
            }
            
        }
    }


}
