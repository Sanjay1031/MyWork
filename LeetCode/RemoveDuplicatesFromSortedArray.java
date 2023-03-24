public class RemoveDuplicatesFromSortedArray {
    // Key to this problem is understanding that duplicates will be right next to each other
    // Ex. - [1,1,2,3,4,4,4,4]
    // The first value is always unique
    // nums must be modified using O(1) extra memory
    public int removeDuplicates(int[] nums) {
        int index = 1; // Keeps track of index for non duplicates
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != nums[i + 1]) { // if true, nums[i + 1] is unique
                nums[index++] = nums[i + 1];
            }
        }
        return index;
    }
}
