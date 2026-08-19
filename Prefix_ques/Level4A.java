public class Level4A {
    // Q10. Find Sum Between Two Indices

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 4, 9};
        int l = 2;
        int r = 5;

        System.out.printf("Sum b/w %d and %d is =  %d ",l,r,getSumBw(arr,l,r));
    }

    static int getSumBw(int[] arr,int l,int r){
        int[] temp = new int[arr.length];
        for(int i = 0;i < arr.length ; i++){
            if(i == 0){
                temp[i] = arr[i];
                continue;
            }
            temp[i] = temp[i-1]+arr[i];
        }

        if(l == 0){
            return temp[r];
        }

        return temp[r] - temp[l-1];
    }
}
