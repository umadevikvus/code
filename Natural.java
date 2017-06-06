package guvi;

import java.util.Scanner;

public class Natural {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number=in.nextInt(),sum=0;
		in.close();
		for(int i=0;i<=number;i++){
			sum+=i;
		}
		System.out.println(sum);
	}

}
