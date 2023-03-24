public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0; // Keeps track of entries in nums array

        for (int i = 0; i < nums.length; i++) { // Loops through nums array
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
