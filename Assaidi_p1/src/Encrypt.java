import java.util.Scanner;

public class Encrypt {
	public static void main(String [] agrs)
	{
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int digit1;
		int digit2;
		int digit3;
		int digit4;
		
		System.out.println("Enter four digit number to encrypt:");
		num = sc.nextInt();
		sc.close();
		
		digit4 = num % 10;
		num /= 10;
		
		digit3 = num % 10;
		num /= 10;
		
		digit2 = num % 10;
		num /= 10;
		
		digit1 = num;
		
		digit1 += 7;
		digit1 %= 10;
		
		digit2 += 7;
		digit2 %= 10;
		
		digit3 += 7;
		digit3 %= 10;
		
		digit4 += 7;
		digit4 %= 10;
		
		System.out.printf("%d%d%d%d\n", digit3, digit4, digit1, digit2);
	}
}
