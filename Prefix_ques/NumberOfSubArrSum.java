import java.util.Arrays;

public class NumberOfSubArrSum {
    public static void main(String[] args) {
        // number of sub array sum less than t
        int t = 10;
        int[] nums = {3, 2, 5, 1, 6,5,1,4};  // 15
        int [] temp = new int[nums.length];
        temp[0] = nums[0];
        
        for (int st= 1;st<nums.length;st++){
            temp[st] = nums[st]+temp[st-1];
        }
        int count = 0;
        int st =0;
        int sum = 0;

        System.out.println(Arrays.toString(temp));
        for (int j=0;j<temp.length;j++){
           if(st == 0){
            sum = temp[j];
           }else{
            sum = temp[j] - temp[st-1];
           }

           while(sum >= t){
            st++;
            if(st ==0){
                sum -=temp[st++];
            }else{
                sum = temp[j]-temp[st-1];
                
            }

           }
           if(sum < t){
            count+=j-st+1;
           }
        }
        System.out.println(count);
    }
}
