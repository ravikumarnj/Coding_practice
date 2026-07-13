

public class CountMatchingPairs {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,5,7,9};
        int[] arr2 = {2,3,4,5,7,8};
        
        int left = 0;
        int right = 0;
        int count = 0 ;

        while(left<arr1.length && right<arr2.length){
            if(arr1[left] == arr2[right]){
                count++;
                left++;
                right++;
            }else if(arr1[left]<arr2[right]){
                left++;
            }else{
                right++;
            }
        }
        
        System.out.println(count);
    }
}
