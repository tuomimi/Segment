package file;

import java.io.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:/", "test.txt");             //�����ļ�����
		try {
			FileOutputStream out = new FileOutputStream(file);
			byte m[] = "Hi,I am Tuomi!".getBytes();
			out.write(m);                                    //�������е���Ϣд�뵽�ļ���
			out.close();                                     //�����ر�
		} catch (Exception e) {                              //�쳣����
			e.printStackTrace();
		}
		try {
			FileInputStream in = new FileInputStream(file);
			byte n[] = new byte[1024];
			int len = in.read(n);                            //���ļ��ж�ȡ��Ϣ
			System.out.println(new String(n, 0, len));
			in.close();                                      //�ر���
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
