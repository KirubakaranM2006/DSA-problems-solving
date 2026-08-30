package dsa_TCS_NQT;

public class maxavgsubarr {
	public static double maxavgSubarray(int arr[],int k) {
		int windowsum=0;
		double windowavg=0;
		for(int i=0;i<k;i++) {
			windowsum+=arr[i];	
		}
		windowavg=(double)windowsum/k;
		double maxavg=windowavg;
		
		for(int j=k;j<arr.length;j++) {
			windowsum=windowsum+arr[j];
			windowsum=windowsum-arr[j-k];
			windowavg=(double)windowsum/k;
			maxavg=Math.max(maxavg, windowavg);
		}
		return maxavg;
		
	}
	


public static void main(String[] args) {

    int arr[] = {1,12,-5,-6,50,3};
    int k = 4;

    double result = maxavgSubarray(arr, k);

    System.out.println(result);
}
}