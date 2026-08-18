// Prefix Sum at a Particular Index
public class TwoPrefix {
    public static void main(String[] args) {
        // build prefix sum then need sum of window from sum(st,end)

        int[] arr = {3, 7, 2, 8, 4};
        System.out.println(getPrefix(arr,0,3));
    }


    // Prefix Sum at a Particular Index
    static int getPrefix(int[] nums,int st,int end){
        int sum = 0;
        int [] temp = new int[nums.length];
        for(int i=0;i<temp.length;i++){
            if(i == 0){
                temp[i] = nums[i];
                continue;
            }
            temp[i] = temp[i-1]+nums[i];
        }

        if(st == 0){
            sum = temp[end];
        }else{
            sum = temp[end] - temp[st-1];
        }

        return sum;
    }
}
