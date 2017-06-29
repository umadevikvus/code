package guvi;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		in.close();
		int[] n=new int[26];
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>=65&&str.charAt(i)<=90)
			if(n[str.charAt(i)-65]==0){
				count++;
				n[str.charAt(i)-65]=1;
			}
			if(str.charAt(i)>=97&&str.charAt(i)<=122){
				if(n[str.charAt(i)-97]==0){
					count++;
					n[str.charAt(i)-97]=1;
				}
			}
		}
		if(count==26){
			System.out.println("Panagram");
		}
		else{
			System.out.println("Not Panagram");
		}
	}
}
	
		
		


