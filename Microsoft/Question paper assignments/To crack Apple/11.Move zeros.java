class Solution {

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) return;

        int leftMostZeroIndex = 0;                      
        for (int i = 0; i < nums.length; i++)
        {
            
            if (nums[i] != 0 && leftMostZeroIndex++ < i)
            {
                nums[leftMostZeroIndex - 1] = nums[i];  
                nums[i] = 0;                            
            }
        }
    }

}
