package dsa_TCS_NQT;

import java.util.Scanner;

public class Freq_each_elemt {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		int visitedalready=-1;

		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=-1) {
				int count=1;
				for(int j=i+1;j<arr.length;j++) {
					
					if(arr[i]==arr[j]) {
						count++;
						arr[j]=visitedalready;
					}
					
				}System.out.println(arr[i]+":"+count);
			}
			
		
	}

}
}