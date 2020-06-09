package rs.superwit.coding;

public class TargetArray {
//	Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//			You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//			Example:
//			Given nums = [2, 7, 11, 15], target = 9,
//			Because nums[0] + nums[1] = 2 + 7 = 9,
//			return [0, 1].
//			Please explain your thought process.

    public int[] getIndices(int[] nums, int target) {
        //handle when input array has less than 2 elements
        if (nums.length>1) {
            //create a variable to store output
            int[] ret = new int[2];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= target) {
                    //set first element of output to be the current index of input
                    ret[0] = i;
                    //loop starting at the next index position
                    for (int j = i + 1; j < nums.length; j++) {
                        //check if sum of value of current index of outer loop
                        // and value at current index of inner loop match target
                        if (nums[i] + nums[j] == target) {
                            //if matches, we found the first correct combination and return output
                            ret[1] = j;
                            return ret;
                        }
                    }
                }
            }
        }
        return null;
    }
}
