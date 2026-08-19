public class Level4One {
    // Find the Total Sum of an Array

    public static void main(String[] args) {
        int[] arr = {4,8,1,3,7};
        System.out.println("sum = "+findSum(arr));
    }

    // sum of a array using prefix sum
    static int findSum(int[] arr){
        int[] temp = new int[arr.length];

        for(int i = 0;i<arr.length;i++){
            if(i == 0){
                temp[i] = arr[i];
                continue;
            }
            temp[i] = temp[i-1]+arr[i];
        }
        // here returning sum of the array.
        return temp[temp.length-1];
    }
}
