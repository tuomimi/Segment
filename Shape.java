//类的继承
//定义父类
package string;

public class Shape {
	public double length;
	public double width;
	public double sidelength;
	public String color;

	public Shape(double length, String color, double width) {
		this.length = length;
		this.width = width;
		this.color = color;
	}
	public Shape(double sidelength,String color){
		this.length=sidelength;
		this.width=sidelength;
		this.color=color;
	}
	public double getLength() {        //得到长
		return length;
	}

	public double getWidth() {         //得到宽
		return width;
	}

	public String getColor() {         //得到颜色
		return color;
	}
	public double getArea(){           //求出长方形的面积
		return length*width;
	}
	public void printInfo(){           //打印
		System.out.println("长："+getLength()+"\n宽："+getWidth()+"\n颜色："+getColor()+"\n面积："+getArea());
	}
}

//定义子类
package string;

public class Square extends Shape {
	public Square(double sidelength, String color) {
		super(sidelength,color);        //调用父类
		super.getArea();
	}
}


//测试
package string;

public class TestSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square(20, "black");
		s.printInfo();
	}
}

