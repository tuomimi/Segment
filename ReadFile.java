//��ȡ���ļ������
package file;

import java.io.File;
import java.io.FileInputStream;

public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:/javacourse/intern", "x.txt");    
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
