package guvi;

import java.util.Scanner;

public class WorkDays {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String[] day = {"Mon","Tue","Wed","Thur","Fri","Sat"};
		String d=in.next();
		in.close();
		System.out.println(WorkingDays(day,d));
	}
	static boolean WorkingDays(String[] day,String d){
		for(int i=0;i<day.length;i++){
			if(d.equalsIgnoreCase(day[i])){
				return true;
			}
			else if(d.equalsIgnoreCase("Sun")){
				return false;
			}
		}
			System.out.println("Please enter a valid day!");
			return false;
	} 
}
