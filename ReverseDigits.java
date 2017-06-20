package guvi;

import java.util.Scanner;

public class ReverseDigits {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		int rev=0;
		while(n!=0){
			rev=(rev*10)+(n%10);
			n/=10;
		}
		System.out.println(rev);
	}

}
