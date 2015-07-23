//���常��
package string;

public abstract class Car {
	public abstract String getName();

	public abstract int getPrice();
}



package string;

public class CarShop extends Car {
	private String name;
	private int price;
	private int money;

	public CarShop(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {   //�õ�����
		return name;
	}

	@Override
	public int getPrice() {     //�õ��۸�
		return price;
	}

	public int getMoney() {     //�õ�����
		return money + price;
	}

	public void sellCar(Car c) {     //��ӡ��Ϣ
		System.out.println("���֣�" + getName() + " " + "�۸�" + getPrice());
	}
}


//����
package string;

public class QQ extends CarShop {

	public QQ(String name, int price) {
		super(name, price);
	}
}


package string;

public class BMW extends CarShop {

	public BMW(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
}


//����
package string;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarShop shop = new CarShop("QQ", 200000);
		shop.sellCar(shop);
		System.out.println("Sale income:" + shop.getMoney());
	}
}