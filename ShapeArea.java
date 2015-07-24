//父类
package test;

public abstract class ShapeArea {
	public abstract double getArea();
}


//长方形
package test;

public class Rectangle extends ShapeArea {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {       //面积
		// TODO Auto-generated method stub
		return length * width;
	}
}



//圆形
package test;

public class Circle extends ShapeArea {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() { // 面积
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
}


//正方形
package test;

public class Square extends ShapeArea {
	private double length;

	public Square(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {     //面积
		// TODO Auto-generated method stub
		return length * length;
	}
}

//三角形
package test;

public class Triangle extends ShapeArea {
	private double length;
	private double height;

	public Triangle(double length, double height) {
		this.length = length;
		this.height = height;
	}

	@Override
	public double getArea() {       //面积
		// TODO Auto-generated method stub
		return 0.5 * length * height;
	}
}




//测试
package test;

import java.util.ArrayList;
import java.util.Collection;

public class TestShapeArea {

	public static void main(String[] arg) {
		// TODO Auto-generated method stub
		System.out.println("Total Area:" + getTotalArea(shapes));
	}

	private static void getTotalArea(ArrayList<String> String) {       //总面积
		ArrayList<String> shapes = new ArrayList<String>();
		shapes.add(new Rectangle(10, 20));
		shapes.add(new Circle(10));
		shapes.add(new Square(10));
		shapes.add(new Triangle(20, 5));
	}
}

