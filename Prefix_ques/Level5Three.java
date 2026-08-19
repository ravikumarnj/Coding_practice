public class Level5Three {
    // Count subarrays with sum divisible by 3

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 6};

        int count =0;

        // brute - force
        for (int i=0;i<nums.length;i++){
            int tempSum = nums[i];
            if(tempSum%3 == 0){
                count++;
            }
            for(int j = i+1;i!=nums.length-1 && j<nums.length;j++){
                tempSum+=nums[j];
                if(tempSum%3 == 0){
                    count++;
                }
            }
        }

        System.out.println("Divisible by 3 Count = "+count);  // 6

        System.out.println("same question by using PREFIX SUM ....");
        System.out.println(divBy3(nums));
    }

    static int divBy3(int[] arr){
        int count = 0;
        int[] temp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i == 0){
                temp[i] = arr[i];
                continue;
            }

            temp[i] = temp[i-1]+arr[i];
        }

        for(int i=0;i<temp.length;i++){
            if(i == 0){
                for(int j=0;j<temp.length;j++){
                    if(temp[j]%3 == 0){
                        count++;
                    }
                }
            }else{
                for(int j=i;j<temp.length;j++){
                    if((temp[j]-temp[i-1])%3 == 0){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
