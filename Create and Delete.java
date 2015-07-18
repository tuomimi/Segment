//文件的创建与删除
package file;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File file=new File("E:/","test.txt");  //创建文件对象
        if(file.exists()){                     //如果文件存在则删除
        	file.delete();
        	System.out.println("文件已删除！");
        }else{                                 //如果文件不存在则创建
        	try{          
        		file.createNewFile();
        		System.out.println("文件已创建！");
        	}catch(Exception e){               //异常处理
        		e.printStackTrace();
        	}
        }
	}
}