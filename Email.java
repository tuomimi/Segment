//ƥ��Email
package email;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������Email��ַ:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if (isMatch(str)) {                      // �ж��Ƿ�ƥ��
			System.out.println("�Ϸ���");
		} else {
			System.out.println("���Ϸ���");
		}
	}

	private static boolean isMatch(String str) {
		// TODO Auto-generated method stub
		if (str.matches("^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$")) {
			return true;
		}
		return false;
	}
}