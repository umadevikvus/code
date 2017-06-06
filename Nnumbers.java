package guvi;

import java.util.Scanner;

public class Nnumbers {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),sum=0;
		in.close();
		for(int i=0;i<=n;i++){
			sum+=i;
		}
		System.out.println(sum);
	}

}
