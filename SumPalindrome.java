package guvi1;

import java.util.Scanner;

public class SumPalindrome {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		in.close();
		int sum=0;
		while(num!=0){
			sum+=num%10;
			num/=10;
		}
		System.out.println(sum);
		int temp=sum;
		int rev=0;
		while(temp!=0){
			rev=(rev*10)+temp%10;
			temp/=10;
		}
		if(rev==sum){
			System.out.println("palindrome");
		}
		else{
			System.out.println("Not palindrome");
		}
	}

}
