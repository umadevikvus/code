package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String original,reversed = "";
		Scanner a=new Scanner(System.in);
		System.out.println("original string ");
		original=a.nextLine();
		a.close();
		int length=original.length(),i;
		for(i=length-1;i>=0;i--){
			reversed=reversed+original.charAt(i);
		}
			System.out.println("reversed string "+reversed);	
	}	
}