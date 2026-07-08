package dsa;

import java.util.Scanner;

public class Rotatekarray {
	public static void rotate(int[]nums,int k) {
		int n=nums.length;
		k=k%nums.length;
		reverse(nums,0,n-1);
		reverse(nums,0,k-1);
		reverse(nums,k,n-1);
		
	} 
	public static void reverse(int nums[],int start,int end) {
		while(start<end) {
			int temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;end--;
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int narray=scan.nextInt();
		int []nums=new int[narray];
		System.out.println("Enter array element");
		for(int i=0;i<nums.length;i++) {
			nums[i]=scan.nextInt();
		}
		int k=scan.nextInt();
		rotate(nums,k);
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}

	}

}
