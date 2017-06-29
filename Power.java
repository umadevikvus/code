package guvi;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int power=in.nextInt();
		in.close();
		int r=1;
		for(int i=0;i<power;i++){
			r*=num;
		}
		System.out.println(r);
	}
}

