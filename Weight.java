package test;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Weight {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader file=new FileReader("E:\\test.txt");
	    BufferedReader reader = new BufferedReader(file);
		String s="";
		String str="";
		while(true){
			s = reader.readLine();
			if (s == null){
				break;
			}
			str+=s;
		}
		getWord(str);
	}

	private static void getWord(String s) {
		// TODO Auto-generated method stub
		String regex = "[A-Za-z0-9]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(s);
		ArrayList<String>word=new ArrayList<String>();
		while(m.find()){
			word.add(m.group(0));
		}
		//System.out.println(word);
		wordWeight(word);
	}

	private static void wordWeight(ArrayList<String> word) {
		// TODO Auto-generated method stub
		ArrayList<Integer> times=new ArrayList<Integer>();
		int []weight=new int[word.size()];
		String []firstword=new String[10];
	}
}
