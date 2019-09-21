import java.util.Scanner;

public class BMI_Calc {
	public static void main(String [] agrs)
	{
		Scanner sc = new Scanner(System.in);
		String unit;
		double weight;
		double height;
		double BMI = 0;
		
		System.out.println("Enter preferred unit of mesurement (lb or kg):");
		unit = sc.next();
		
		if(unit.compareTo("lb") == 0)
		{
			System.out.println("Enter weight (in lb):");
			weight = sc.nextDouble();
			
			System.out.println("Enter height (in inches)");
			height = sc.nextDouble();
			sc.close();
			
			BMI = (703.0 * weight) / (height * height);
		}else if(unit.compareTo("kg") == 0)
		{
			System.out.println("Enter weight (in kg):");
			weight = sc.nextDouble();
			
			System.out.println("Enter height (in meters)");
			height = sc.nextDouble();
			sc.close();
			
			BMI = weight / (height * height);
		}else {
			sc.close();
		}
		
		System.out.println("");
		System.out.printf("Your BMI: %.1f\n\n", BMI);
		
		System.out.println("Underweight if BMI < 18.5");
		System.out.println("Normal wieght if 18.5 <= BMI <= 24.9");
		System.out.println("Overweight if 25 <= BMI <= 29.9");
		System.out.println("Obesity if BMI >= 30.0");
	}
}
