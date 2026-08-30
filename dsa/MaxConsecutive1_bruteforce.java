package dsa_TCS_NQT;

public class MaxConsecutive1_bruteforce {
	 public static int findMaxConsecutiveOnes(int[] nums) {
	       int maxcount=0;
	       for(int i=0;i<nums.length;i++) {
	    	   int count=0;
	    	   for(int j=i;j<nums.length;j++) {
	    		   if(nums[j]==1) {
	    			   count++;
	    		   }else {
	    			   break;
	    		   }
	    		   
	    	   }
	    	   maxcount=Math.max(maxcount, count);
	       }
	       return maxcount;
	 }

	public static void main(String[] args) {
		int nums[]= {1,1,0,1,1,1};
		int call=findMaxConsecutiveOnes(nums);
		System.out.println(call);

	}

}
