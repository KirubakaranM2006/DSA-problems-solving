package practicecode;

import java.util.Arrays;
import java.util.Scanner;

import basic.scanner;

public class secondlarg {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//bruteforce
	/*	int arr[]= {1,2,3,7,5};
		Arrays.sort(arr);
		int seclarg=-1;
		int firstmax=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			if(arr[i]!=firstmax) {
				seclarg=arr[i];
				break;
			}
		}System.out.println(seclarg);
		*/
		
		//better
		/*
		int arr[]= {7,3,9,28,64,32,64};
		int fstlarg=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>fstlarg) {
				fstlarg=arr[i];
			}
		}
		int seclarg=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>seclarg && arr[i]<fstlarg) { //logic every time -1 ....b/w....64 -> that is 2nd larg keep update
				seclarg=arr[i];
			}
		}System.out.println(seclarg);*///->2loops so optimal we go
		
		//optimal
		int arr[]= {7,3,9,28,64,32,64};
		int fstlarg=arr[0],seclarg=-1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>fstlarg) {
				seclarg=fstlarg;
				fstlarg=arr[i];
			}else if(arr[i]>seclarg && arr[i]!=fstlarg) {
				seclarg=arr[i];
			}
		}System.out.println(seclarg);
		
	}

}
