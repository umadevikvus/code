package guvi;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number=in.nextInt(),i=0;
		in.close();
		while (number!=0){
			number/=10;
			i++;
		}
		System.out.println(i);
	}

}
