package guvi2;

import java.util.Scanner;

public class Pin {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("First Name:");
		String FName=in.next();
		System.out.println("Last Name:");
		String LName=in.next();
		System.out.println("PIN:");
		String pin=in.next();
		System.out.println("N:");
		int n=in.nextInt();
		in.close();
		String big="";
		String small="";
		if(FName.length()==LName.length()){
			if(FName.charAt(0)>LName.charAt(0)){
				big=LName;
				small=FName;
			}
			else{
				big=LName;
				small=FName;
			}
			
		}
		else if(FName.length()>LName.length()){
			big=FName;
			small=LName;
		}
		else{
			big=LName;
			small=FName;
		}
		
		System.out.println(big.charAt(0)+small+pin.charAt(n-1)+pin.charAt((pin.length()-n)));
	}
	

}
