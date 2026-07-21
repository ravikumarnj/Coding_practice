import java.util.Arrays;

// we can solve this by 3 ways 
// 1) by counting zeros.
// 2) by calculating both prefix and suffix product separately then multiplying them
//   store prefix products and suffix products

// 3) by calculatign prefix product seperately, then funneling suffix product, as prefixProd[ ] = prefix*variable(suffix product)


public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

        // if they ask without division go for prefixSum + suffixSum 
        int[] nums = {-1,1,0,-3,3}; // 24,12,8,6

        int [] prefixProd = new int[nums.length];
        Arrays.fill(prefixProd,1);

        // prefix products.

        for(int i = 1;i<nums.length;i++){
            prefixProd[i] = prefixProd[i-1]*nums[i-1];
        } 

        int var = 1; // the job of this variable is just to track suffix product only

        prefixProd[nums.length-1] = prefixProd[nums.length-1]*var;

        for(int i = nums.length-2;i>=0;i--){
            var = var*nums[i+1];
            prefixProd[i]*= var;
        }

        System.out.println(Arrays.toString(prefixProd));
        
    }
}
