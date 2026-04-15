public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE; 
        int currentSum = 0;
        
        for (int i = 0; i < nums.length; i++) { // Fixed 'ii' to 'i'
            currentSum = nums[i] + currentSum;
            
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
    
        return maxSum; 
    }

    public static void main(String[] args) {
        MaxSubarray solver = new MaxSubarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + solver.maxSubArray(nums));
        // Expected output: 6
    }
} 
