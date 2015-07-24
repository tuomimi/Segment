package file;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("E:\\test.txt");
		try {
			FileInputStream in = new FileInputStream(f);
			byte n[] = new byte[4096];
			int len = in.read(n);                            //从文件中读取信息
			//System.out.println(new String(n, 0, len));
			in.close();                                      //关闭流
		} catch (Exception e) {
			e.printStackTrace();
		}
		File passage = f;  
	    Scanner scanner = new Scanner( passage );
		String items=( passage.split("");
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(String s:items){
			if(map.containsKey(s))
				map.put(s, map.get(s)+1);
			else
				map.put(s, 1);	
		}
	}
}