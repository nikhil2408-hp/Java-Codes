package binary;

import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {
	public static int binarySearch(int arr[],int last,int first,int key) {
//		Arrays.sort(arr,first,last);
		//int middle=(first +last)/2;
		if(first<=last) {
			int middle=(first +last)/2;
		if(arr[middle]>key)
			return binarySearch(arr,middle-1,first, key);
		else if(arr[middle]==key)
			return middle;
		else
			return binarySearch(arr,last,middle+1,key);
		}
		return -1;
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the total number of elements in array=");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
        	System.out.printf("Enter %d number",i+1);
        	a[i]=sc.nextInt();
        }
       // int key=sc.nextInt();
        System.out.printf("Enter number to be Searched=");
        int find=sc.nextInt();
        int result=binarySearch(a,n,0,find);
        Arrays.parallelSort(a,0,n);
        System.out.print("Your entered element in sorted form ");
        System.out.println(a);
        System.out.print("Element is found at "+result+"postion in sorted form");
        sc.close();
        
        
        
	}

}
