public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,4};

        int st = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[st]){
                nums[++st] = nums[i];
            }
        }

        System.out.println(st+1);

        for(int i=0;i<=st;i++){
            System.out.println(nums[i]);
        }
    }
}
