package dsa_TCS_NQT;

import java.util.HashSet;

public class Contains_dupl2 {
	    public static boolean containsDuplicate(int[] nums) {

	        HashSet<Integer> set = new HashSet<>();

	        for (int num : nums) {

	            if (set.contains(num)) {
	                return true;
	            }

	            set.add(num);
	        }

	        return false;
	    }


	public static void main(String[] args) {
		int nums[]= {1,2,3,4,1,3};
		boolean val=containsDuplicate(nums);
		System.out.println(val);

	}

}
