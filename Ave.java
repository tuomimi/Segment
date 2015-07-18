import java.util.ArrayList;
import java.util.Scanner;

public class Ave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		double m = 0;
		int i = 0;
		ArrayList<Integer> scores = new ArrayList<Integer>(); // 定义一个动态数组
		System.out.println("Please input some scores:");// 输入多个成绩
		do {
			int input = a.nextInt();
			i = input;
			scores.add(input);
		} while (i != 0); // 直到输入为零循环结束
		m = averageScore(scores);
		System.out.println(m);
	}

	public static double averageScore(ArrayList<Integer> scores) {
		double sum = 0;
		int i = 0;
		// while循环
		while (i < scores.size()) {
			sum = sum + scores.get(i);
			i = i + 1;
		}
		/*do-while循环：
		do {
			sum = sum + scores.get(i);
			i = i + 1;
		} while (i < scores.size());
		两种for循环：
		for (i = 0; i < scores.size(); i++) {
			sum = sum + scores.get(i);
		}
		for (int x : scores) {
			sum = sum + x;
		}*/ 
		return sum / (scores.size() - 1);
	}
}
