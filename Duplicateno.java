public class Duplicateno {
    public int findDuplicate(int[] nums) {
        int i,j;
        for (i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
       return-1;
    }

    public static void main(String[] args) {
        Duplicateno solver = new Duplicateno();
        int[] testCase = {1, 3, 4, 2, 2};
        System.out.println("Duplicate is: " + solver.findDuplicate(testCase));
    }
}