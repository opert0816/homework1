package week3;

import java.io.BufferedReader;

public class P28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入一個整數");
		BufferedReader br1=
				new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		
		int num = Integer.parseInt(str1);
		
		System.out.print("您輸入的數字是"+num);
		System.out.print("請輸入字串");
		BufferedReader br2=
				new BufferedReader(new InputStreamReader(System.in));
		String str2 = br2.readLine();
		System.out.print("剛剛輸入的字串是"+str2);
				
	}


}
