import java.util.Arrays;

public class Level5TwoTwo {
    

    public static void main(String[] args) {
        int[] arr = {2,1,2,1};
        System.out.println("C = "+countEven(arr));
    }

    static int countEven(int[] nums){
        int count = 0;
        int[] temp = new int[nums.length];
        for(int i = 0;i< nums.length;i++){
            if(i == 0){
                temp[i] = nums[i];
                continue;
            }
            temp[i] = temp[i-1]+nums[i];
        }
        System.out.println(Arrays.toString(temp));

        for(int i = 0;i<temp.length-1;i++){
            if(i == 0){
                for(int j = 0;j<temp.length;j++){
                    if(temp[j]%2 == 0){
                        count++;
                    }
                }
            }else{
                for(int j=i+1;j<temp.length;j++){
                    if((temp[j] - temp[i-1])%2 == 0 ){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
