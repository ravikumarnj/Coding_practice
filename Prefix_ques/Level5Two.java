public class Level5Two {
    // count the number of even sum subarray  = somethimes this might be wrong one to solve by using SLIDING window.

    // So go for prefix sum.

    // 2, 1, 3 
//  NOTE: i used sliding window to solve this there is a catch
//  1) when the window is not valid  REMOVE from left then i may loose my
//       potential window elements which may add up with next to get EVEN


    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 1};
        System.out.println("Even Sum Count: "+countEven(arr));
    }
    static int countEven(int [] arr){
        int count = 0;
        int windowSum = 0;
        int left = 0;
        int right = 0;
        while(right < arr.length){
            windowSum+=arr[right];

            // wrong 
            while(windowSum%2 != 0){
                windowSum-=arr[left++];
            }
            if(windowSum%2 == 0){
                
                count++;
            }
                System.out.println();
            // while(left<=right && windowSum%2 == 0){
            //     count++;
            //     left++;
            // }
            right++;
        }

        return count;
    }
}
