package binarysearch;
import java.util.Scanner;
import java.util.Arrays;

public class binarysearch {
	public static void main(String args[]){
		int n,b,num;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter th enumber elements=");
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		Arrays.sort(a,0,n);
		System.out.print("Enter the number to be Searched=");
		num=s.nextInt();
	    int f=0;
		int l=n-1;
		int m=(f+l)/2;
		while(f<=l){
			//m=(f+l)/2;
			if(a[m]<num)
				f=m+1;
			else if(a[m]==num){
				System.out.println(num+"number is found at"+(m+1)+"postion");
				break;
			}
			else
				l=m-1;
			m=(f+l)/2;
				}
	     if(f>l)
	    	  System.out.println("Number you have entered is not found");
		
		
	}
	

}
