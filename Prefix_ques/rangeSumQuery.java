public class rangeSumQuery {
    public static void main(String[] args) {
        
        int[] arr = {3, 2, 5, 1, 6, 4};
        int st = 1;
        int end = 4;

        // sum bw 1 to 4th index.
        System.out.println(sum(arr,st,end));

        System.out.println("------------------");
        // multiple range queries..

        int[] nums = {2, 4, 1, 7, 3, 5};
        int[] stt = {1,0,2,3};
        int[] endd = {3,4,5,3};
        for(int i=0;i<stt.length;i++){
            System.out.println(sum(nums,stt[i],endd[i]));
        }
    }

    // Range sum Query.

    static int sum(int[] arr,int st,int end){
        int[]temp = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            if(i == 0){
                temp[i] = arr[i];
                continue;
            }
            temp[i] = temp[i-1]+arr[i];
        }

        if(st == 0){
            return temp[end];
        }

        return temp[end]-temp[st-1];
    }
}
