package guvi;

import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		in.close();
		int n=Integer.parseInt(str);
		System.out.println(n);
	}
}

