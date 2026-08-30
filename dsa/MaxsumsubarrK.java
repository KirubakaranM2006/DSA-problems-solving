package dsa_TCS_NQT;

public class MaxsumsubarrK {

	public static void main(String[] args) {
		
		int arr[]= {1,4,2,10,23,3,1,0,20};
		int max=0;
		int k=4;
		for(int i=0;i<arr.length-k;i++) {
			int sum=0;
			for(int j=i;j<k+i;j++) {
				sum=sum+arr[j];
			}
			max=Math.max(max, sum);
		}
		System.out.println(max);
		

	}

}
