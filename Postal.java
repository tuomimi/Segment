//匹配邮政编码
package post;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Postal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入邮政编码(6位):");
		Scanner sc = new Scanner(System.in);
		String code = sc.nextLine();
		if (isMatch(code)) {                       //判断是否匹配
			System.out.println("匹配！");
		} else {
			System.out.println("不匹配！");
		}
	}

	private static boolean isMatch(String code) {
		// TODO Auto-generated method stub
		if (code.matches("[0-9]{6}")) {           //正则表达式
			return true;
		}
		return false;
	}

}
