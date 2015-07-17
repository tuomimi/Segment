package identity;

import java.util.Scanner;

public class Id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please inout your id(18):");
		Scanner c=new Scanner(System.in);
		String id=c.nextLine();
		Id x=new Id();
		int []a=new int[18];
	    x.checkId(a,id);
	}
	public static void checkId(int[] a,String id)
    {
		int m;
		int sum=0;
    	for(int i=0;i<18;i++)
    	{
    		int n = 0;
    		switch(i)
    		{
    		case 0: n=a[0]*7;
    		case 1: n=a[1]*9;
    		case 2: n=a[2]*10;
    		case 3: n=a[3]*5;
    		case 4: n=a[4]*8;
    		case 5: n=a[5]*4;
    		case 6: n=a[6]*2;
    		case 7: n=a[7]*1;
    		case 8: n=a[8]*6;
    		case 9: n=a[9]*3;
    		case 10: n=a[10]*7;
    		case 11: n=a[11]*9;
    		case 12: n=a[12]*10;
    		case 13: n=a[13]*5;
    		case 14: n=a[14]*8;
    		case 15: n=a[15]*4;
    		case 16: n=a[16]*2;
    		case 17: n=a[17]*1;
    		default:break;
    		}
            sum=sum+n;
    	}
    	m=sum%11;
    	if(m==0||m==1||m==2||m==3||m==4||m==5||m==6||m==7||m==8||m==9||m==10)
              System.out.println("合法！");
    	else
    		System.out.println("不合法！");
    }
}
