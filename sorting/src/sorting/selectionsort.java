package sorting;

import java.util.Scanner;

public class selectionsort {
	void sort(int arr[]) {
		int len=arr.length;
		for(int i=0;i<len;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min])
					min=j;
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
		}
	}
	void printarry(int arr[]){
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
			//System.out.println();
		}
		}
	public static void main(String args[]) {
		selectionsort obj=new selectionsort();
		int n,temp;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the total no of elements=");
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		//obj.printarry(a);
		obj.sort(a);
		obj.printarry(a);
	}

}
