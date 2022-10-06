package week3;

public class P34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 5;
		System.out.println("num1和num2的各種運算");
		System.out.println("num1+num2等於"+(num1+num2));
		System.out.println("num1-num2等於"+(num1-num2));
		System.out.println("num1*num2等於"+(num1*num2));
		System.out.println("num1/num2等於"+(num1/num2));
		System.out.println("num1%num2等於"+(num1%num2));
		
		int a=0;
		int b=0;
		int c=0;
		b=a++;
		c=++a;
		System.out.println("是在指定值之後才遞增所以b的值為"+b);
		System.out.println("是在遞增之後才指定值所以b的值為"+c);
	}

}
