package guvi;

import java.util.Scanner;

public class CountTwo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		int count=0;
		int x=0;
		int y=0;
		System.out.println(n);
		for(int i=0;i<n;i++){
			x=i/10;
			y=i%10;
			if(x==2){
				count++;
			}
			if(y==2){
				count++;
			}
		}
		System.out.println(count);
	}
}
			
		

