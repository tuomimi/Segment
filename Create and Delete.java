//�ļ��Ĵ�����ɾ��
package file;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File file=new File("E:/","test.txt");  //�����ļ�����
        if(file.exists()){                     //����ļ�������ɾ��
        	file.delete();
        	System.out.println("�ļ���ɾ����");
        }else{                                 //����ļ��������򴴽�
        	try{          
        		file.createNewFile();
        		System.out.println("�ļ��Ѵ�����");
        	}catch(Exception e){               //�쳣����
        		e.printStackTrace();
        	}
        }
	}
}