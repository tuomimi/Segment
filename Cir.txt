
import java.util.Scanner;
public class Cir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double CM_PER=3.14;
		System.out.println("Please input r:");
	        Scanner sc=new Scanner(System.in);
	        double r=sc.nextInt();
                System.out.println("The circle area is"+CM_PER*r*r);
	}

}
