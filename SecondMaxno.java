public class SecondMaxno {
    public int findmax(int [] nums){
        int i, max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for(i=0;i<nums.length;i++){
            if(nums[i]>max){
                secondMax=max;
                max=nums[i];
            }
             else if (nums[i] > secondMax && nums[i] != max) {
                secondMax = nums[i];
            }
        }
                return secondMax;
        }  

public static void main(String [] args){
    SecondMaxno max = new SecondMaxno();
    int[] testCase = {6,4,8,17,19};
        System.out.println("Maximum no is: " + max.findmax(testCase));
}
}