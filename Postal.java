//ƥ����������
package post;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Postal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������������(6λ):");
		Scanner sc = new Scanner(System.in);
		String code = sc.nextLine();
		if (isMatch(code)) {                       //�ж��Ƿ�ƥ��
			System.out.println("ƥ�䣡");
		} else {
			System.out.println("��ƥ�䣡");
		}
	}

	private static boolean isMatch(String code) {
		// TODO Auto-generated method stub
		if (code.matches("[0-9]{6}")) {           //������ʽ
			return true;
		}
		return false;
	}

}
