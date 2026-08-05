class FindAvgOfK{
    public double findMaxAverage(int[] nums, int k) {
        double result = Double.NEGATIVE_INFINITY;
        for (int i=0;i<=nums.length-k;i++){
            double sum =0;
            for(int j = i;j<i+k;j++){
                sum+=nums[j];
            }
            result = Math.max(result , sum/k);
        }

        return result;
    }

    public static void main(String[] args) {
        FindAvgOfK f = new FindAvgOfK();
        int[] arr = {4,3,2,1,6,7,4,-1,6};
        int k = 3;
        System.out.println(f.findMaxAverage(arr,k));
    }
}