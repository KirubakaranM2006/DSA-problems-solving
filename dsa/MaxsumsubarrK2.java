package dsa_TCS_NQT;

public class MaxsumsubarrK2 {

    public static int maxSumSubarray(int arr[], int k) {
    	int windowsum=0;
    	for(int i=0;i<k;i++) {
    		windowsum=windowsum+arr[i];//calc for 1st window 1,4,2,10->17
    	}
    	int maxval=windowsum;//becoz what if the 1st subbarray might be maximum so using this to keep updating
    	for(int j=k;j<arr.length;j++) {
    		windowsum=windowsum+arr[j];//1,4,2,10,23->40
    		windowsum=windowsum-arr[j-k];//40-arr[4-4]->40-1->39
    		maxval=Math.max(maxval, windowsum);
    	}
    	return maxval;

        
    }

    public static void main(String[] args) {

        int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;

        int result = maxSumSubarray(arr, k);

        System.out.println(result);
    }

}
