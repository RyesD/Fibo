import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number of range : ");
		int num = input.nextInt();
		
		fibo(num);
	}

	private static void fibo(int num) {
		// TODO Auto-generated method stub
		int num1 = 1, num2 = 2;
		int i = 0;
		
		while(i < num) {
			System.out.println(num1 + " ");
			
			int num3 = num2 + num1;
			num1=num2;
			num2=num3;
			i = i + 1;
		}
	}
	
}
