//定义父类
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
	public String getName() {   //得到名字
		return name;
	}

	@Override
	public int getPrice() {     //得到价格
		return price;
	}

	public int getMoney() {     //得到收入
		return money + price;
	}

	public void sellCar(Car c) {     //打印信息
		System.out.println("名字：" + getName() + " " + "价格：" + getPrice());
	}
}


//子类
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


//测试
package string;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarShop shop = new CarShop("QQ", 200000);
		shop.sellCar(shop);
		System.out.println("Sale income:" + shop.getMoney());
	}
}