package dsa_TCS_NQT;

import java.util.HashSet;

public class Revomedup_hashset {

	    public static void containsDuplicate(int[] nums) {

	        HashSet<Integer> set = new HashSet<>();
	        for(int num:nums) {
	        	set.add(num);
	        	}
	        System.out.println(set);
	        }
	  
	    



	public static void main(String[] args) {
		int nums[]= {1,2,3,4,1,3};
		containsDuplicate(nums);
		
		

	}

}
