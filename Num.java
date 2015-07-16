import java.util.Scanner;

public class Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input x(0-100):");
		Scanner b = new Scanner(System.in);
		int x = b.nextInt();
		Num h = new Num();
		h.guess(x);
	}

	public static void guess(int x) {
		int i;
		int low = 0;
		int hight = 100;
		int middle = 0;
		for (i = 1; i < 100; i++) {
			middle = (low + hight) / 2;
			if (x == middle) {
				break;
			} else if (x > middle) {
				low = middle + 1;
			} else {
				hight = middle - 1;
			}
		}
		x = middle;
		System.out.println("经过" + i + "次查找得到数字" + x);
	}
}