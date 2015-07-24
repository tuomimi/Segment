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

public class TestShapeArea {

	public static void main(String[] arg) {
		// TODO Auto-generated method stub
                double arr[]=new double[4];
	        Rectangle r=new Rectangle(10,20);
                arr[0]=r.getArea();
	        Circle c=new Circle(10);
                arr[1]=c.getArea();
                Square s=new Square(10);
                arr[2]=s.getArea();
                Triangle t=new Triangle(10, 5);
                arr[3]=t.getArea();
	        System.out.println("Total Area:" + (arr[0]+arr[1]+arr[2]+arr[3]));
}

