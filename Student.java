//�����ಢ����
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
    //��ȡ����
	public String getName() {
		return name;
	}
    //��ȡ�꼶
	public int getGrade() {
		return grade;
	}
    //��ȡרҵ
	public String getMajor() {
		return major;
	}
    //�ļ��ɼ�
	public int[] getCet4_scores() {
		return cet4_scores;
	}

	public void setCet4_scores(int[] cet4_scores) {
		this.cet4_scores = cet4_scores;
	}
    //��һ��
	public void level_up() {
		grade = grade + 1;
	}
    //�Ƿ�ͨ���ļ�
	public boolean passed_cet4() {
		for (int i = 0; i < cet4_scores.length; i++) {
			if (cet4_scores[i] > 425) {
				return true;
			}
		}
		return false;
	}
    //��ӡ�������꼶��רҵ�Լ��Ƿ�ͨ���ļ�
	public void printInfo() {
		System.out.println("\n"+getName() + " " + getGrade() + " " + getMajor()
				+ " ");
		if (passed_cet4()) {
			System.out.print("�ļ�ͨ��!");
		} else
			System.out.print("�ļ�δͨ����");
	}
}





//����
package string;

import string.Student;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cet4_scores = { 418, 420, 441 };
		Student s = new Student("����", 2, "��Ϣ�Կ�����", cet4_scores);
		s.printInfo();     //��ӡ�������꼶��רҵ�Լ��Ƿ�ͨ���ļ�
		s.level_up();      //��һ��
		s.printInfo();     //��ӡ�������꼶��רҵ�Լ��Ƿ�ͨ���ļ�
	}
}
