package datastruture;

public class RotateArray {
	void leftrotateArray(int arr[],int d,int n) {
		for(int i=0;i<d;i++) {
			leftrotatearraybyone(arr,n);
		}
	}
	
	void leftrotatearraybyone(int arr[],int n) {
		int temp=arr[0];
		for(int i=0;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[n-1]=temp;
	}
	
	void printArray(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		RotateArray ra=new RotateArray();
		int arr[]= {1,2,3,4,5,6,7};
		ra.leftrotateArray(arr, 4, 7);
		ra.printArray(arr, 7);
	}

}
