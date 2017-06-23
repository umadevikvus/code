package guvi;

import java.util.Scanner;

public class WorldHello {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		in.close();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				String front=str.substring(0,i);
				String end=str.substring(i+1);
				str=end+" "+front;
			}
		}
      System.out.println(str);
	}

}
