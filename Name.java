//�ж�Ӣ�������Ƿ�ƥ��
package name;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������Ӣ����:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		if (isMatch(name)) {                                // �ж��Ƿ�ƥ��
			System.out.println("ƥ�䣡");
		} else {
			System.out.println("��ƥ�䣡");
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
