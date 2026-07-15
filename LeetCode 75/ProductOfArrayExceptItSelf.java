import java.util.Arrays;

public class ProductOfArrayExceptItSelf {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };

        int[] productLeft = new int[nums.length];
        int[] productRight = new int[nums.length];

        Arrays.fill(productLeft, 1);
        Arrays.fill(productRight, 1);

        // performing prefix product
        for (int i = 1; i < nums.length; i++) {
            productLeft[i] = productLeft[i - 1] * nums[i - 1];

        }

        // performing suffix product
        productRight[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            productRight[i] = productRight[i + 1] * nums[i + 1];
        }

        System.out.println(Arrays.toString(productLeft)); // giving prefix products
        System.out.println(Arrays.toString(productRight)); // giving suffix products

        System.out.println("another approach which reduces some space overhead..");
        System.out.println(Arrays.toString(product(nums)));

    }

    static int[] product(int[] arr) {
        int[] temp = new int[arr.length];
        
        // calculating suffix product and passing it through variable "val".
        int val = 1;
        for (int i = 0; i < temp.length; i++) {
            temp[i] = val;
            val *= arr[i];
        }

        // calculating suffix product and passing it through variable "val".
        val = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            temp[i] = temp[i] * val;
            val *= arr[i];
        }
        System.out.println(Arrays.toString(temp));

        return temp;
    }
}
