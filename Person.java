//类的组合
package string;

public class Person {
	public double weight;
	public double height;

	public Person(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}

	public double getWeight() {      //得到重量
		return weight;
	}

	public double getHeight() {      //得到高度
		return height;
	}

	public void printInfo() {        //打印信息
		System.out.println("重量：" + getWeight() + "\n高度：" + getHeight());
	}
}



package string;

public class Limb extends Person {

	public Limb(double height, double weight) {
		super(height, weight);
	}
}


package string;

public class Hand extends Limb {

	public Hand(double height, double weight) {
		super(height, weight);
	}
}



package string;

public class Leg extends Limb {

	public Leg(double height, double weight) {
		super(height, weight);
	}
}


//测试
package string;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hand h = new Hand(20, 15);
		Leg l = new Leg(80, 50);
		System.out.println("手：");
		h.printInfo();
		System.out.println("腿：");
		l.printInfo();
	}
}
