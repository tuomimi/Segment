//定义父类
package string;

public abstract class Shape1 {
    public abstract double getArea();
}


//子类
package string;

public class Rectangle extends Shape1 {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*width;
	}
}


//子类
package string;

public class Circle extends Shape1 {
	private double radius;
	
	public Circle(double radius){
		this.radius=radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
}


//测试
package string;

public class TestShape1 {

	public static void printArea(Shape1 shape) {
		System.out.println(shape.getArea());
	}

	public static void main(String[] args) {
		printArea(new Rectangle(5, 20));
		printArea(new Circle(10));
	}
}
