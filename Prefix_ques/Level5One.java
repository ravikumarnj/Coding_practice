import java.util.Arrays;

public class Level5One {
//     LEVEL 5
                // Prefix Sum Variations
                //         ↓
                // Prefix Sum + Frequency
                // Prefix Sum + Counting
                // Prefix Sum + Two Pointers
                // Prefix Sum + Sliding Window
                // Prefix Sum + Difference Thinking


                public static void main(String[] args) {
                    // prefix sum + counting

                    int[] arr = {0, 1, 0, 0, 1, 1};
                    System.out.println("count = "+countt(arr));
                }

                static int countt(int[] nums){
                    for(int i = 0;i<nums.length;i++){
                        if(nums[i] == 0){
                            nums[i] = -1;
                        }

                    }
                    int count = 0;
                    int[] temp = new int[nums.length];
                    System.out.println(Arrays.toString(nums));
                    for(int i = 0;i<nums.length;i++){
                        if(i == 0){
                            temp[i] = nums[i];
                            continue;
                        }
                        temp[i] = temp[i-1]+nums[i];
                    }
                    System.out.println(Arrays.toString(temp));
                    for(int i=0;i<temp.length-1;i++){
                        if(i == 0){
                              for(int j=0;j<temp.length;j++){
                                if(temp[j] == 0){
                                    count++;
                                }
                              }  
                        }else{
                            for(int j=i+1;j<temp.length;j++){
                                if(temp[j]-temp[i-1] == 0){
                                    count++;
                                }
                            }
                        }
                        
                    }
                    return count;
                }
}
