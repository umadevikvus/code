package guvi;

import java.util.Scanner;

public class EvenBetweenIntervals {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the begining");
		int n1=in.nextInt();
		System.out.println("Enter the ending");
		int n2=in.nextInt();
		in.close();
		for(int i=n1;i<n2;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
}


