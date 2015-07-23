//������
package string;

public class Person {
	public double weight;
	public double height;

	public Person(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}

	public double getWeight() {      //�õ�����
		return weight;
	}

	public double getHeight() {      //�õ��߶�
		return height;
	}

	public void printInfo() {        //��ӡ��Ϣ
		System.out.println("������" + getWeight() + "\n�߶ȣ�" + getHeight());
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



//����
package string;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hand h = new Hand(20, 15);
		Leg l = new Leg(80, 50);
		System.out.println("�֣�");
		h.printInfo();
		System.out.println("�ȣ�");
		l.printInfo();
	}
}