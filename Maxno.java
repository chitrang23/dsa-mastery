public class Maxno {
    public int findmax(int [] nums){
        int i,maxnumber= nums[0];
        for(i=0;i<nums.length;i++){
            if(nums[i]>maxnumber){
                maxnumber=nums[i];
            }
        }        
                    return maxnumber;
    }  

public static void main(String [] args){
    Maxno max = new Maxno();
    int[] testCase = {6,4,8,6,19};
        System.out.println("Maximum no is: " + max.findmax(testCase));
}
}