public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int sum =0;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
        }

        int leftSum = 0;
        for(int i=0; i<nums.length; i++) {
            leftSum += nums[i];
            if(sum - leftSum - nums[i] == leftSum)
                return i;
        }

        return -1;

    }
}
