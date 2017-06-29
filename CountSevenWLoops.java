package guvi;

import java.util.Scanner;

public class CountSevenWLoops {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int input=in.nextInt();
		in.close();
		if(input>0){
		String s=Integer.toString(input);
		int count=s.length()-s.replaceAll("7","").length();
		System.out.println(count);
		}
		else{
			System.out.println("Please enter a non-negative integer!");
		}
	}
	

}
