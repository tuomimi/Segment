package days;

import java.util.*;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input year:");
		String str = " ";
		Scanner in = new Scanner(System.in);
		str = in.nextLine();
		if (isNumberic(str))
			getDays(str);
		else
			System.out.println("Error!!!");
	}

	public static void getDays(String str) {
		int year = Integer.parseInt(str);
		if ((year % 100 == 0 && year % 400 == 0)
				|| (year % 100 != 0 && year % 4 == 0))
			System.out.println("This year has 366 days!");
		else
			System.out.println("This year has 365 days!");
	}

	public static boolean isNumberic(String str) {
		for (int i = str.length(); --i >= 0;) {
			int chr = str.charAt(i);
			if (chr < 48 || chr > 57)
				return false;
		}
		return true;
	}
}
