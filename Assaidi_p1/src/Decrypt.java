import java.util.Scanner;

public class Decrypt {
	public static void main(String [] agrs)
	{
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int digit1;
		int digit2;
		int digit3;
		int digit4;
		
		System.out.println("Enter four digit number to decrypt:");
		num = sc.nextInt();
		sc.close();
		
		digit4 = num % 10;
		num /= 10;
		
		digit3 = num % 10;
		num /= 10;
		
		digit2 = num % 10;
		num /= 10;
		
		digit1 = num;
		
		if(digit1>6)
			digit1 -= 7;
		else
			digit1 += 3;
		
		if(digit2>6)
			digit2 -= 7;
		else
			digit2 += 3;
		
		if(digit3>6)
			digit3 -= 7;
		else
			digit3 += 3;
		
		if(digit4>6)
			digit4 -= 7;
		else
			digit4 += 3;
		
		System.out.printf("%d%d%d%d\n", digit3, digit4, digit1, digit2);
	}
}
