//读取大文件并输出
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
			int len = in.read(n);                            //从文件中读取信息
			System.out.println(new String(n, 0, len));
			in.close();                                      //关闭流
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
