package dsa_TCS_NQT;

public class MaxConsecutive1 {

	    public static int findMaxConsecutiveOnes(int[] nums) {
	        int count=0;int maxcount=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]==1){
	                count++;
	            }else{
	                count=0;
	            }
	            maxcount=Math.max(maxcount,count);
	        }
	        return maxcount;
	        
	    }

	public static void main(String[] args) {
		int nums[]= {1,1,0,1,1,1};
		int call=findMaxConsecutiveOnes(nums);
		System.out.println(call);

	}

}
