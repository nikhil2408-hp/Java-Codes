package booleanproject;

public class booleanlearning {
	public static  void main(String args[])
	{
		boolean passdoor=true;
		boolean missdoor=false;
		int doorcount=0;
		boolean passeddoor;
		if(missdoor) {
			System.out.println("we have passed the first door");
			doorcount++;
		}
		if(passdoor) {
			System.out.println("we have passed the second door");
			doorcount++;		
			}
		if(doorcount==2) {
			passeddoor=true;		}
	
	if(passeddoor) {
		System.out.println("Congratulation you have won the game");
	}

}
}