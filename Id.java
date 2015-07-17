package identity;

import java.util.Scanner;

public class Id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input your id(18):");
		Scanner c = new Scanner(System.in);
		String id = c.nextLine();
		int[] a = new int[18];
		// 将身份证号分装到数组中
		byte[] b = id.getBytes();
		for (int i = 0; i < b.length; i++) {
			a[i] = ((int) b[i]) - 48;
		}
		// 调用函数
		Id x = new Id();
		x.checkId(a, id);
	}

	public static void checkId(int[] a, String id) {
		int m;
		int sum = 0;
		int n = 0;
		boolean flag = false;// 标志位
		// 将身份证号前17位乘以系数并求和
		for (int i = 0; i < 17; i++) {
			int[] c = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
			n = a[i] * c[i];
			sum = sum + n;
		}
		m = sum % 11;
		int[] f = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		byte[] d = { '1', '0', 'x', '9', '8', '7', '6', '5', '4', '3', '2' }; // 将身份号最后一位放进一个数组
		for (int i = 0; i < 11; i++) {
			// 当满足对应条件时位真
			if (m == f[i] && a[17] == (((int) d[i]) - 48)) {
				flag = true;
			} else {
				// 特殊情况X
				if (m == 2 && a[17] == ('x' - 48)) {
					flag = true;
				}
			}
		}
		// 判断是否合法
		if (flag == true) {
			System.out.println("合法！");
		} else {
			System.out.println("不合法");
		}
	}
}
