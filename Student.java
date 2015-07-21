//定义类并测试
package string;

public class Student {
	private String name;
	private int grade;
	private String major;
	private int[] cet4_scores;

	public Student(String name, int grade, String major, int[] cet4_scores) {
		this.name = name;
		this.grade = grade;
		this.major = major;
		this.setCet4_scores(cet4_scores);
	}
    //获取姓名
	public String getName() {
		return name;
	}
    //获取年级
	public int getGrade() {
		return grade;
	}
    //获取专业
	public String getMajor() {
		return major;
	}
    //四级成绩
	public int[] getCet4_scores() {
		return cet4_scores;
	}

	public void setCet4_scores(int[] cet4_scores) {
		this.cet4_scores = cet4_scores;
	}
    //升一级
	public void level_up() {
		grade = grade + 1;
	}
    //是否通过四级
	public boolean passed_cet4() {
		for (int i = 0; i < cet4_scores.length; i++) {
			if (cet4_scores[i] > 425) {
				return true;
			}
		}
		return false;
	}
    //打印姓名、年级、专业以及是否通过四级
	public void printInfo() {
		System.out.println("\n"+getName() + " " + getGrade() + " " + getMajor()
				+ " ");
		if (passed_cet4()) {
			System.out.print("四级通过!");
		} else
			System.out.print("四级未通过！");
	}
}





//测试
package string;

import string.Student;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cet4_scores = { 418, 420, 441 };
		Student s = new Student("脱咪", 2, "信息对抗技术", cet4_scores);
		s.printInfo();     //打印姓名、年级、专业以及是否通过四级
		s.level_up();      //升一级
		s.printInfo();     //打印姓名、年级、专业以及是否通过四级
	}
}
