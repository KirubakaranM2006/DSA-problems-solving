package dsa;

public class removedup_elm {

	public static void main(String[] args) {
		
		int arr[]= {1,1,2,3,5,7,7};
		int i=0;
		int j;
		for(j=1;j<arr.length;j++) {
			if(arr[j]>arr[i]) {
				arr[i+1]=arr[j];
				i++;
				
			}
		}
		for(int k=0;k<=i;k++) {
			
		    System.out.println(arr[k]);}

	}

}
