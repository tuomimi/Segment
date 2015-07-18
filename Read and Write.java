package file;

import java.io.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:/", "test.txt");             //创建文件对象
		try {
			FileOutputStream out = new FileOutputStream(file);
			byte m[] = "Hi,I am Tuomi!".getBytes();
			out.write(m);                                    //将数组中的信息写入到文件中
			out.close();                                     //将流关闭
		} catch (Exception e) {                              //异常处理
			e.printStackTrace();
		}
		try {
			FileInputStream in = new FileInputStream(file);
			byte n[] = new byte[1024];
			int len = in.read(n);                            //从文件中读取信息
			System.out.println(new String(n, 0, len));
			in.close();                                      //关闭流
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
