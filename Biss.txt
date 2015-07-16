package bissextile;

import java.util.Scanner;
public class Biss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input year:");
                Scanner sc=new Scanner(System.in);
                int year=sc.nextInt();
                Biss b=new Biss();
                System.out.println( b.isLeap(year));
	}
        public static boolean isLeap(int year)
        {
    	        return (year%100==0 && year%400==0)||
    			(year%100!=0 && year%4==0);
	}

}
