package dsa;

public class Twosum {

	public static void main(String[] args) {
		int arr[]= {1,4,3,5,6};
		int target=4;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(i+":"+j);
					
				}
			}
		}

	}

}
