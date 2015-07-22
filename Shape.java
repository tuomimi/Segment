//��ļ̳�
//���常��
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
	public double getLength() {        //�õ���
		return length;
	}

	public double getWidth() {         //�õ���
		return width;
	}

	public String getColor() {         //�õ���ɫ
		return color;
	}
	public double getArea(){           //��������ε����
		return length*width;
	}
	public void printInfo(){           //��ӡ
		System.out.println("����"+getLength()+"\n��"+getWidth()+"\n��ɫ��"+getColor()+"\n�����"+getArea());
	}
}

//��������
package string;

public class Square extends Shape {
	public Square(double sidelength, String color) {
		super(sidelength,color);        //���ø���
		super.getArea();
	}
}


//����
package string;

public class TestSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square(20, "black");
		s.printInfo();
	}
}

