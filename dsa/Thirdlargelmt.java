package dsa_TCS_NQT;

import java.util.Scanner;

public class Thirdlargelmt {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		int fstlar=Integer.MIN_VALUE;
		int seclar=Integer.MIN_VALUE;
		int thirdlar=Integer.MIN_VALUE;
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>fstlar) {
				thirdlar=seclar;
				seclar=fstlar;
				fstlar=arr[i];
			}
			else if(arr[i]>seclar&&arr[i]!=fstlar) {
				thirdlar=seclar;
				seclar=arr[i];
			}
			else if(arr[i]>thirdlar&&arr[i]!=seclar&&fstlar!=arr[i]) {
				thirdlar=arr[i];
				
			}
		}
					System.out.println(thirdlar);
		
	}

}
