package linked;

public class LinkedList {
 Node head,tail;
 public void insert(int data) {
	 Node node=new Node();
	 node.data=data;
	 node.next=null;
	 if(head==null) {
		  head=node;
	 }
	 else {
		 Node n=head;
		 while(n.next!=null) {
			 n=n.next;
			}
		 n.next=node;
	 }
	 
 }
 public void insertAtFirst(int data) {
	 Node node=new Node();
	 node.data=data;
	 node.next=head;
	 head=node;
 }
 public void insertAt(int pos,int data) {
	 Node node=new Node();
	 node.data=data;
	 Node temp=head;
	 if(pos==0) {
		 insertAtFirst(data);
	 }
	 else { for(int i=1;i<pos-1;i++) {
		 temp=temp.next;
	}
	 node.next=temp.next;
	 temp.next=node;}
	 
 }
 public void deleteAt(int pos) {
	if(pos==1)
	 head=head.next;
	
	else {
		Node n=head;
		for(int i=1;i<pos-1;i++) {
			n=n.next;
		}
		 n.next=n.next.next;
	}
	
 }
 public void deleteLast() {
	 Node n=head;
	 while(n.next.next!=null) {
		 n=n.next;
	 }
	 n.next=null;
 }
 
 public void show() {
	 Node n=head;
	 while(n.next!=null) {
		 System.out.println(n.data);
		 n=n.next;
	 }
	 System.out.println(n.data);
	 
 }
}
