package logic;

public class SumDigits1 {
	public static int output1;
	public static void main( String [] args ) {
	userMethod( 1234); 
	System.out.println( output1 ); 

}
	public static void userMethod(int input1) {
		int rev=0;
		int rem=0;
		while(input1>0){
			rem=input1%10;
			rev=(rev*10)+rem;
			input1/=10;
		}
		int x=0;
		int y=0;
		while(rev>0){
			rem=rev%10;
			x+=rem;
			y+=x;
			rev/=10;
		}
		output1=y;
	}
}

