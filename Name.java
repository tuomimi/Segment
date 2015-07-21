//ÅĞ¶ÏÓ¢ÎÄÃû×ÖÊÇ·ñÆ¥Åä
package name;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ÇëÊäÈëÓ¢ÎÄÃû:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		if (isMatch(name)) {                                // ÅĞ¶ÏÊÇ·ñÆ¥Åä
			System.out.println("Æ¥Åä£¡");
		} else {
			System.out.println("²»Æ¥Åä£¡");
		}
	}
	private static boolean isMatch(String name) {
		// TODO Auto-generated method stub
		if (name.matches("[a-zA-Z]{1,}\\s{0,}[a-zA-Z]{1,}\\s{1,}[a-zA-Z]{0,}\\s{0,}")) {
			return true;
		}
		return false;
	}
}
