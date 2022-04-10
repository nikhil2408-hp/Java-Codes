package queue;
import java.util.Scanner;
public class circularqueue {
  Scanner s=new Scanner(System.in);
	int n=5;
  int front=-1,rear=-1;
  int queue[]=new int[n];
  void enqueue(int x)
  {
	  if((rear+1)%n==front) {
		  rear=front=0;
		  queue[rear]=x;
	  }
	  else if((rear+1)%n==front) {
		  System.out.println("Queue if Full");
	  }
	  else {
		  System.out.println("Element "+x+" is Enqueued in Queue");
		  rear=(rear+1)%n;
		  queue[rear]=x;
	  }
	  
  }
  void deque() {
	  if(front==-1 && rear==-1) {
		  System.out.println("Queue is Empty");
	  }
	  else if(front==rear) {
		  System.out.println("Element "+ queue[front] + " is removed froim Queue");
		  front=rear=-1;
		}
	  else {
		  System.out.println("Element "+queue[front]+" is removed from Queue");
		  front=(front+1)%n;
	  }
  }
  void display() {
	  int i=front;
	  if(front==-1 && rear==-1)
	  {System.out.println("Queue is Empty");}
      else {
    	  while(i!=rear) {
    		  System.out.print(" "+queue[i]);
    		  i=(i+1)%n;
    	  }
    	 System.out.println(" "+queue[rear]); 
    	 }
}
  public static void main(String args[]) {
	  
	circularqueue q=new circularqueue();
	q.enqueue(5);
	q.enqueue(8);
	q.enqueue(-3);
	q.deque();
	q.enqueue(7);
	q.enqueue(34);
	q.deque();
	q.display();
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}