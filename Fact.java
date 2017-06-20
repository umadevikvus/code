package guvi;

import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int fact=1,n,i;
		n=in.nextInt();
		in.close();
		for(i=1;i<=n;i++){
			fact*=i;
		}
		System.out.println(fact);
	}
	
}





